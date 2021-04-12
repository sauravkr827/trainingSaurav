package de.hybris.trainingSaurav.storefront.controllers.customController;


import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingSaurav.core.customCommandService.ManufacturerDetailsCommandService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSaurav.facades.customFacade.impl.DefaultCustomer1Facade;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import de.hybris.trainingSaurav.storefront.customCommand.ManufacturerDetailsCommand;
import de.hybris.trainingSaurav.storefront.util.ManufacturerDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

@Controller
@RequestMapping("/")
public class Customer1Controller extends AbstractPageController
{
    @Autowired
    DefaultCustomer1Facade defaultCustomer1Facade;

    @Resource(name = "manufacturerDetailsUtil")
    ManufacturerDetailsUtil manufacturerDetailsUtil;

    @Resource(name = "commandService")
    ManufacturerDetailsCommandService commandService;



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





    /*@RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(Model model)
   {

    model.addAttribute("test","Hello");
    final String test="test";

    try
    {
        final ContentPageModel accountPage=getContentPageForLabelOrId(test);
        storeCmsPageInModel(model,accountPage);
        setUpMetaDataForContentPage(model,accountPage);

    } catch (CMSItemNotFoundException e) {
        e.printStackTrace();
    }
    return getViewForPage(model);

}

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test1(Model model)
    {

        model.addAttribute("test","Hello");
        final String test="test";

        try
        {

            final ContentPageModel accountPage=getContentPageForLabelOrId(test);

            storeCmsPageInModel(model,accountPage);
            setUpMetaDataForContentPage(model,accountPage);

        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }


    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2(Model model)
    {

        model.addAttribute("test","Hello");
        final String test="test1";

        try
        {

            final ContentPageModel testPage=getContentPageForLabelOrId(test);

            storeCmsPageInModel(model,testPage);
            setUpMetaDataForContentPage(model,testPage);


        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }


    */





      /*  @RequestMapping(value ="/t",method = RequestMethod.GET)
        public String home(final Model model) throws CMSItemNotFoundException
        {
            model.addAttribute("hi","Hello");
            final String test="test";

            try
            {

                final ContentPageModel testPage=getContentPageForLabelOrId(test);

                storeCmsPageInModel(model,testPage);
                setUpMetaDataForContentPage(model,testPage);


            } catch (CMSItemNotFoundException e) {
                e.printStackTrace();
            }
            return getViewForPage(model);

        }*/



    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String getDataByUser(Model model) throws CMSItemNotFoundException
    {


        model.addAttribute("test","Hello");
        final String form="form";

        try
        {
            model.addAttribute("model1", new ManufacturerDetailsCommand());

            final ContentPageModel testPage=getContentPageForLabelOrId(form);

            storeCmsPageInModel(model,testPage);
            setUpMetaDataForContentPage(model,testPage);


        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public String saveModel(@ModelAttribute("model1") ManufacturerDetailsCommand detailsModel, Model model) throws InterceptorException {

        ManufacturerDetailsModel manufacturerDetailsModel = manufacturerDetailsUtil.convertCommandToModel(detailsModel);


          String  msg = commandService.saveData(manufacturerDetailsModel);
          model.addAttribute("msg", msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.form;
    }




    }









