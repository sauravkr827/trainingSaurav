package de.hybris.trainingSaurav.facades.customPopulator;


import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class IsNewBussinessUserPopulator implements Populator<CustomerModel,CustomerData>

{


    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {

        customerData.setIsNewBussinessUser(customerModel.getIsNewBussinessUser());
    }
}
