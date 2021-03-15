package de.hybris.trainingSaurav.facades.customFacade;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;

import java.util.Date;
import java.util.List;

public interface Customer1Facade {

    List<Customer1Data> getListOfCustomer();
   /* Date getCreationDate();*/
   List<CustomerData>  getListOfCustomerFromExisting();
}
