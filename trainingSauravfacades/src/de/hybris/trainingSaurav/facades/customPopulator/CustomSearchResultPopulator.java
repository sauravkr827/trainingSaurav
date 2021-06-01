package de.hybris.trainingSaurav.facades.customPopulator;

import de.hybris.platform.commercefacades.product.data.ProductData;

import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantOptionsProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import org.apache.log4j.Logger;

import java.util.*;


public class CustomSearchResultPopulator extends SearchResultVariantOptionsProductPopulator
{
    Logger logger=Logger.getLogger(CustomSearchResultPopulator.class);

    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);

        target.setManufacturerDetailsNamelist(this.getValue(source,"manufacturerDetails_string_mv"));

        logger.info("CustomSearchResultPopulator is calling ");

     }
}
