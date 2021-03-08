package de.hybris.trainingSaurav.core.customService;

import de.hybris.trainingSaurav.core.model.Customer1Model;

import java.util.Date;
import java.util.List;

public interface Customer1Service
{
    List<Customer1Model> getListOfCustomer();
    Date getCreationDate();

    public void checkOldAndNew(Customer1Model customer1Model);
}
