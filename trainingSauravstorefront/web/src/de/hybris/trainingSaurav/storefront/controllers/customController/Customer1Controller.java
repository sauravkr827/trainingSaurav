package de.hybris.trainingSaurav.storefront.controllers.customController;


import de.hybris.trainingSaurav.facades.customFacade.impl.DefaultCustomer1Facade;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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
}
