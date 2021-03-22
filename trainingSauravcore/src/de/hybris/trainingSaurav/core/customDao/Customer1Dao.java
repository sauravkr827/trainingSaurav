package de.hybris.trainingSaurav.core.customDao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingSaurav.core.model.Customer1Model;

import java.util.Date;
import java.util.List;

public interface Customer1Dao
{
    List<Customer1Model>  getListOfCustomer();
    public Customer1Model getCreationDate(int customerId);
    List<Customer1Model> getOldCustomerData(Date OldDate);
    List<CustomerModel> getOldRegCustomers(String preDate);

    List<CustomerModel>  getListOfCustomerFromExisting();

    public List<CustomerModel> checkHistoryOfCronJob(String date);
}
