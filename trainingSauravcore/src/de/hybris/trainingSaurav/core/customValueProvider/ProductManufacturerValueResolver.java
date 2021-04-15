package de.hybris.trainingSaurav.core.customValueProvider;

import de.hybris.platform.catalog.model.KeywordModel;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import de.hybris.platform.solrfacetsearch.provider.impl.ValueProviderParameterUtils;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductManufacturerValueResolver extends AbstractValueResolver<ProductModel, Object, Object>
{
    public static final String OPTIONAL_PARAM = "optional";
    public static final boolean OPTIONAL_PARAM_DEFAULT_VALUE = true;


    @Override
    protected void addFieldValues(final InputDocument document, final IndexerBatchContext batchContext,
                                  final IndexedProperty indexedProperty, final ProductModel product,
                                  final ValueResolverContext<Object, Object> resolverContext) throws FieldValueProviderException
    {
        boolean hasValue = false;

        final Collection<String> manufacturerName = getManufacturerName(product);

        if (manufacturerName!=null)
        {
            hasValue = true;
            document.addField(indexedProperty, manufacturerName, resolverContext.getFieldQualifier());
        }

        if (!hasValue)
        {
            final boolean isOptional = ValueProviderParameterUtils.getBoolean(indexedProperty, OPTIONAL_PARAM,
                    OPTIONAL_PARAM_DEFAULT_VALUE);
            if (!isOptional)
            {
                throw new FieldValueProviderException("No value resolved for indexed property " + indexedProperty.getName());
            }
        }
    }


    private Collection<String> getManufacturerName(ProductModel product)
    {

        final Collection<String> listOfName = new ArrayList<String>();

        for (ManufacturerDetailsModel productModel:product.getManufacturerDetails())
        {
             String name=productModel.getName();

            listOfName.add(name);

        }

        return  listOfName;

    }



}
