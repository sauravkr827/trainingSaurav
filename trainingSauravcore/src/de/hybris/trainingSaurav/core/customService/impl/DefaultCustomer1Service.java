package de.hybris.trainingSaurav.core.customService.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSaurav.core.customDao.impl.DefaultCustomer1Dao;
import de.hybris.trainingSaurav.core.customService.Customer1Service;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import org.springframework.beans.factory.annotation.Required;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultCustomer1Service implements Customer1Service {

     DefaultCustomer1Dao defaultCustomer1Dao;
     ModelService modelService;

    @Override
    public List<Customer1Model> getListOfCustomer() {

        return defaultCustomer1Dao.getListOfCustomer();
    }

    @Override
    public List<CustomerModel> getListOfCustomerFromExisting()
    {
        return defaultCustomer1Dao.getListOfCustomerFromExisting();
    }



    /*CustomerIsNewJob  Service method*/
    @Override
    public List<CustomerModel> getOldRegCustomers(int noOfDayTOConsider) {

        validateParameterNotNull(noOfDayTOConsider, "No NoOfDayConsider founded");

        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -noOfDayTOConsider);
        final Date oldDate = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String preDate = dateFormat.format(oldDate);

        List<CustomerModel> modelList=defaultCustomer1Dao.getOldRegCustomers(preDate);

        if(modelList!=null)
        {
            for (final CustomerModel customerModel : modelList)
            {
                customerModel.setIsNewCustomer(true);
                modelService.save(customerModel);

            }
        }

         return modelList;

    }


    public DefaultCustomer1Dao getDefaultCustomer1Dao() {
        return defaultCustomer1Dao;
    }

   @Required
    public void setDefaultCustomer1Dao(DefaultCustomer1Dao defaultCustomer1Dao) {
        this.defaultCustomer1Dao = defaultCustomer1Dao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
