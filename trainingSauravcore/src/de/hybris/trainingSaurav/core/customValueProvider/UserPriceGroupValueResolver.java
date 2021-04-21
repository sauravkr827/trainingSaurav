package de.hybris.trainingSaurav.core.customValueProvider;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.product.PriceService;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.Qualifier;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import de.hybris.platform.solrfacetsearch.provider.impl.ValueProviderParameterUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.Collection;
import java.util.List;

public class UserPriceGroupValueResolver extends AbstractValueResolver<ProductModel, Object, Object>
{


    public static final String OPTIONAL_PARAM = "optional";
    public static final boolean OPTIONAL_PARAM_DEFAULT_VALUE = true;

    private PriceService priceService;

    public PriceService getPriceService()
    {
        return priceService;
    }

    @Required
    public void setPriceService(final PriceService priceService)
    {
        this.priceService = priceService;
    }

    @Override
    protected List<PriceInformation> loadQualifierData(final IndexerBatchContext batchContext,
                                                       final Collection<IndexedProperty> indexedProperties, final ProductModel product, final Qualifier qualifier)
    {
        return loadPriceInformations(indexedProperties, product);
    }




    @Override
    protected void addFieldValues(InputDocument inputDocument, IndexerBatchContext indexerBatchContext, IndexedProperty indexedProperty, ProductModel productModel, ValueResolverContext<Object, Object> valueResolverContext) throws FieldValueProviderException {
        boolean hasPrice = false;

        final List<PriceInformation> priceInformations = (List<PriceInformation>)valueResolverContext.getQualifierData();
        if (priceInformations != null)
        {
            final Double priceValue = getPriceValue(indexedProperty, priceInformations);
            if (priceValue != null)
            {
                hasPrice = true;
                inputDocument.addField(indexedProperty, priceValue, valueResolverContext.getFieldQualifier());
            }
        }

        if (!hasPrice)
        {
            final boolean isOptional = ValueProviderParameterUtils.getBoolean(indexedProperty, OPTIONAL_PARAM,
                    OPTIONAL_PARAM_DEFAULT_VALUE);
            if (!isOptional)
            {
                throw new FieldValueProviderException("No value resolved for indexed property " + indexedProperty.getName());
            }
        }
    }





    protected List<PriceInformation> loadPriceInformations(final Collection<IndexedProperty> indexedProperties,
                                                           final ProductModel product)
    {
        return priceService.getPriceInformationsForProduct(product);
    }



    protected Double getPriceValue(final IndexedProperty indexedProperty, final List<PriceInformation> priceInformations)
            throws FieldValueProviderException
    {
        Double value = null;

        if (priceInformations != null && !priceInformations.isEmpty())
        {
            value = Double.valueOf(priceInformations.get(0).getPriceValue().getValue());
        }

        return value;
    }



}
