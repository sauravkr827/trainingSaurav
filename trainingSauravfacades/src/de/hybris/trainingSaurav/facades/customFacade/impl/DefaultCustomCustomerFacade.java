package de.hybris.trainingSaurav.facades.customFacade.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.apache.commons.lang.StringUtils;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultCustomCustomerFacade extends DefaultCustomerFacade
{

    @Override
    protected void setCommonPropertiesForRegister(RegisterData registerData, CustomerModel customerModel) {


        customerModel.setIsNewBussinessUser(registerData.getIsNewBussinessUser());

        super.setCommonPropertiesForRegister(registerData, customerModel);
    }
}
