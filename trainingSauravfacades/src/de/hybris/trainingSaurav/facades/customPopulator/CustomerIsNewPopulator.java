package de.hybris.trainingSaurav.facades.customPopulator;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;

public class CustomerIsNewPopulator extends CustomerPopulator
{
    @Override
    public void populate(CustomerModel source, CustomerData target) {
        super.populate(source, target);

        target.setIsNewCustomer(source.getIsNewCustomer());

    }
}
