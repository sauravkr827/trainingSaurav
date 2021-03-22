package de.hybris.trainingSaurav.core.customService;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.core.model.CustomerIsNewCronJobModel;

import java.util.Date;
import java.util.List;

public interface Customer1Service
{
    List<Customer1Model> getListOfCustomer();
    List<CustomerModel>  getListOfCustomerFromExisting();
    List<CustomerModel> getOldRegCustomers(int noOfDayToConsider);

    public List<CustomerModel> checkHistoryOfCronJob(Date date);
}
