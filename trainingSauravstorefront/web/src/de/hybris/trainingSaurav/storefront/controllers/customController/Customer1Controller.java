package de.hybris.trainingSaurav.storefront.controllers.customController;


import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.trainingSaurav.facades.customFacade.impl.DefaultCustomer1Facade;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

@Controller
@RequestMapping("/")
public class Customer1Controller
{
    @Autowired
    DefaultCustomer1Facade defaultCustomer1Facade;

    @RequestMapping("/customerList")
    public String getListOfData(Model model)
    {
        List<Customer1Data> customer1DataList=defaultCustomer1Facade.getListOfCustomer();


        model.addAttribute("list",customer1DataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.customer;

    }


    @RequestMapping("/customer")
    public String getListOfCustomer(Model model)
    {
        List<CustomerData> customer1DataList=defaultCustomer1Facade.getListOfCustomerFromExisting();


        model.addAttribute("list",customer1DataList);
        model.addAttribute("size",customer1DataList.size());

        return ControllerConstants.Views.Pages.ManufacturerDetails.customerList;

    }
}
