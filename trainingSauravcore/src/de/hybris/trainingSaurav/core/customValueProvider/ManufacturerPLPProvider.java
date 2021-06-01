package de.hybris.trainingSaurav.core.customValueProvider;

import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ManufacturerPLPProvider  extends AbstractPropertyFieldValueProvider implements FieldValueProvider, Serializable
{
    private FieldNameProvider fieldNameProvider;
    @SuppressWarnings("deprecation")
    @Override
    public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexedProperty,
                                                 final Object obj) throws FieldValueProviderException
    {
        if (obj instanceof ProductModel)
        {
            final ProductModel product = (ProductModel) obj;
            final List<FieldValue> fieldValues = createFieldValue(product, indexConfig, indexedProperty);
            return fieldValues;
        }
        else
        {
            throw new FieldValueProviderException("Cannot get online days for a product model");
        }
    }

    @SuppressWarnings("boxing")
    protected List<FieldValue> createFieldValue(final ProductModel product, final IndexConfig indexConfig,
                                                final IndexedProperty indexedProperty)
    {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();

        List<ManufacturerDetailsModel> list= (List<ManufacturerDetailsModel>) product.getManufacturerDetails();

        if (list != null) {
            for (ManufacturerDetailsModel model : list) {

                addFieldValues(fieldValues, indexedProperty, null, model.getName());
            }
        }
        return fieldValues;
    }


    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty,
                                  final LanguageModel language, final Object value)
    {
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty,
                (language == null) ? null : language.getIsocode());
        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    public FieldNameProvider getFieldNameProvider()
    {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }

}
