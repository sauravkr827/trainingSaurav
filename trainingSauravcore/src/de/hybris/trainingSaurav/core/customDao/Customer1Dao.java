package de.hybris.trainingSaurav.core.customDao;

import de.hybris.trainingSaurav.core.model.Customer1Model;

import java.util.Date;
import java.util.List;

public interface Customer1Dao
{
    List<Customer1Model>  getListOfCustomer();
    Customer1Model getCreationDate(int id);
}
