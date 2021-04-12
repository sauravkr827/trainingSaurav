package de.hybris.trainingSaurav.storefront.controllers.customController;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.trainingSaurav.core.customCommandService.ManufacturerDetailsCommandService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import de.hybris.trainingSaurav.storefront.customCommand.ManufacturerDetailsCommand;
import de.hybris.trainingSaurav.storefront.util.ManufacturerDetailsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class Custom2Controller extends AbstractPageController
{

    @Resource(name = "manufacturerDetailsUtil")
    ManufacturerDetailsUtil manufacturerDetailsUtil;

    @Resource(name = "commandService")
    ManufacturerDetailsCommandService commandService;




    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String home(final Model model) throws CMSItemNotFoundException
    {
        model.addAttribute("hi","hello");
        String pg="add";
        try
        {
            model.addAttribute("data", new ManufacturerDetailsCommand());

            final ContentPageModel testPage=getContentPageForLabelOrId(pg);

            storeCmsPageInModel(model,testPage);
            setUpMetaDataForContentPage(model,testPage);


        } catch (CMSItemNotFoundException e) {
            e.printStackTrace();
        }
        return getViewForPage(model);

    }


    @ExceptionHandler
    @RequestMapping(value = "/postData", method = RequestMethod.POST)
    public String saveModel(@ModelAttribute("data") ManufacturerDetailsCommand detailsModel, Model model) throws CMSItemNotFoundException {

        ManufacturerDetailsModel manufacturerDetailsModel = manufacturerDetailsUtil.convertCommandToModel(detailsModel);
        String msg=null;
        try {
            msg = commandService.saveData(manufacturerDetailsModel);
        }
        catch (Exception e){
            model.addAttribute("error","please enter alphanumeric value" +e.getCause());
        }
        model.addAttribute("msg", msg);

        String page="addTest";

        storeCmsPageInModel(model, getContentPageForLabelOrId(page));

        return "redirect:/add";
    }



    /*Test  Case*/



   /* @RequestMapping(value="/add1",method = RequestMethod.GET)
    public String home1(final Model model) throws CMSItemNotFoundException
    {
        model.addAttribute("hi","hello");

            model.addAttribute("data", new ManufacturerDetailsCommand());

        return ControllerConstants.Views.Pages.ManufacturerDetails.msg;

    }


    @ExceptionHandler
    @RequestMapping(value = "/postData1", method = RequestMethod.POST)
    public String saveModel1(@ModelAttribute("data") ManufacturerDetailsCommand detailsModel, Model model) throws CMSItemNotFoundException {

        ManufacturerDetailsModel manufacturerDetailsModel = manufacturerDetailsUtil.convertCommandToModel(detailsModel);
        String msg=null;
        try {
            msg = commandService.saveData(manufacturerDetailsModel);
        }
        catch (Exception e){
            model.addAttribute("error","please enter alphanumeric value" +e.getCause());
        }
        model.addAttribute("msg", msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.msg;
    }

*/
   @RequestMapping(value = "/latestProductsPage", method = RequestMethod.GET)
   public String manufacturerCmsForm(Model model) {
       final String test = "latestProductsPage";
       try {
           final ContentPageModel contentPageModel = getContentPageForLabelOrId(test);
           storeCmsPageInModel(model, contentPageModel);
           setUpMetaDataForContentPage(model, contentPageModel);

       } catch (CMSItemNotFoundException e) {
           e.printStackTrace();
       }
       return getViewForPage(model);
   }


}
