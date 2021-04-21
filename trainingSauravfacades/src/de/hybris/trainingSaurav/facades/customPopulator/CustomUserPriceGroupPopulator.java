package de.hybris.trainingSaurav.facades.customPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.jalo.config.SolrSearchConfig;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrSearchConfigModel;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;


public class CustomUserPriceGroupPopulator implements Populator<SolrFacetSearchConfigModel, IndexConfig> {

   final static Logger log= Logger.getLogger(CustomUserPriceGroupPopulator.class);

    @Override
    public void populate(SolrFacetSearchConfigModel source, IndexConfig target) throws ConversionException {

        log.info("CustomUserGroupPopulator is calling ");

       target.setUserGroup(source.getUserGroup());

    }


}
