package de.hybris.trainingSaurav.core.customValueProvider;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import java.util.*;

public class ProductManufacturerValueProvider  extends AbstractPropertyFieldValueProvider implements FieldValueProvider {

    private FieldNameProvider fieldNameProvider;
    private CommonI18NService commonI18NService;

    @Override
    public Collection<FieldValue> getFieldValues(final IndexConfig indexConfig, final IndexedProperty indexedProperty, final Object model) throws FieldValueProviderException
    {
        if (model instanceof ProductModel)
        {
            final ProductModel product = (ProductModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();

            // case of the indexed property is localized
            if (indexedProperty.isLocalized())
            {
                // retrieve and iterate over all the configured languages
                final Collection<LanguageModel> languages = indexConfig.getLanguages();
                for (final LanguageModel language : languages)
                {
                    fieldValues.addAll(createFieldValue(product, language, indexedProperty));
                }
            }
            // case of the indexed property is not localized
            else
            {
                fieldValues.addAll(createFieldValue(product, null, indexedProperty));
            }
            return fieldValues;
        }

        throw new FieldValueProviderException("Error: item is not a Product type !");
    }

    protected List<FieldValue> createFieldValue(final ProductModel product, final LanguageModel language, final IndexedProperty indexedProperty)
    {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        // get Unit name by language
        final String ManufacturerName = getManufacturerName(product, language);
        if (ManufacturerName != null)
        {
            // add Unit name value to the fieldValues list
            addFieldValues(fieldValues, indexedProperty, language, ManufacturerName);
        }
        return fieldValues;
    }



    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty, final LanguageModel language, final Object value)
    {
        // generate all Solr fields based on different qualifiers
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, language == null ? null : language.getIsocode());
        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    private String getManufacturerName(ProductModel product, LanguageModel language)
    {
       /* return product.getManufacturerDetails().get.getName(commonI18NService.getLocaleForLanguage(language));*/

        String name=null;

        for (ManufacturerDetailsModel productModel:product.getManufacturerDetails())
        {
         name=productModel.getName();

        }

        return  name;

    }

    @Required
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }

    @Required
    public void setCommonI18NService(final CommonI18NService commonI18NService)
    {
        this.commonI18NService = commonI18NService;
    }
}