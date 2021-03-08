package de.hybris.trainingSaurav.facades.customPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;

public class Customer1Populator implements Populator<Customer1Model, Customer1Data> {

    @Override
    public void populate(Customer1Model source, Customer1Data target) throws ConversionException {

        if (source != null) {
            target.setCustomerId(source.getCustomerId());
            target.setCustomerName(source.getCustomerName());
            target.setCustomerCreated(source.getCustomerCreated());
            target.setNewCustomer(source.getNewCustomer());
        }
    }
}
