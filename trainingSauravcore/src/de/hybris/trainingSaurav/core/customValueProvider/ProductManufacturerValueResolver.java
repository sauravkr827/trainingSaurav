package de.hybris.trainingSaurav.core.customValueProvider;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractValueResolver;
import de.hybris.platform.solrfacetsearch.provider.impl.ValueProviderParameterUtils;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;
import org.fest.util.Collections;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;



public class ProductManufacturerValueResolver extends AbstractValueResolver<ProductModel, Object, Object>
{

    private static final Logger LOG= Logger.getLogger(ProductManufacturerValueResolver.class);





    @Override
    protected void addFieldValues(final InputDocument document, final IndexerBatchContext batchContext,
                                  final IndexedProperty indexedProperty, final ProductModel product,
                                  final ValueResolverContext<Object, Object> resolverContext) throws FieldValueProviderException
    {

        final Collection<String> manufacturerName = getManufacturerName(product);

        if (!CollectionUtils.isEmpty(manufacturerName))
        {
            document.addField(indexedProperty, manufacturerName, resolverContext.getFieldQualifier());
        }


        else
        {
            LOG.info("==============================No value found for index======================");
        }
    }






    private Collection<String> getManufacturerName(ProductModel product) {

        final Collection<String> listOfName = new ArrayList<String>();

        if (!CollectionUtils.isEmpty(product.getManufacturerDetails()))
        {

            for (ManufacturerDetailsModel productModel : product.getManufacturerDetails())
            {
                String name = productModel.getName();

                listOfName.add(name);

            }

            return listOfName;

        }
        else
            {
                LOG.info("==============ManufacturerDetails Is not assigned for Product=================");

            return  null;
            }
        }


    }




