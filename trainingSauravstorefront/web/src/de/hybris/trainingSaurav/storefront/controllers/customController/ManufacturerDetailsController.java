package de.hybris.trainingSaurav.storefront.controllers.customController;

import de.hybris.trainingSaurav.core.customCommandService.ManufacturerDetailsCommandService;
import de.hybris.trainingSaurav.core.customService.impl.DefaultManufacturerDetailsService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSaurav.facades.customFacade.impl.DefaultManufacturerDetailsFacade;
import de.hybris.trainingSaurav.facades.product.data.ManufacturerDetailsData;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import de.hybris.trainingSaurav.storefront.customCommand.ManufacturerDetailsCommand;
import de.hybris.trainingSaurav.storefront.util.ManufacturerDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/")
public class ManufacturerDetailsController {

    @Resource(name = "defaultManufacturerDetailsFacade")
    DefaultManufacturerDetailsFacade defaultManufacturerDetailsFacade;

    @Resource(name = "manufacturerDetailsUtil")
    ManufacturerDetailsUtil manufacturerDetailsUtil;

    @Resource(name = "commandService")
    ManufacturerDetailsCommandService commandService;

  @Resource(name="defaultManufacturerDetailsService")
    DefaultManufacturerDetailsService defaultManufacturerDetailsService;


    @RequestMapping("/getById/{id}")
    public String getManufacturerDetailsById(@PathVariable("id") int id, Model model) {
        ManufacturerDetailsData manufacturerDetailsData = defaultManufacturerDetailsFacade.getManufacturerDetailsById(id);

        model.addAttribute("data", manufacturerDetailsData);

        return ControllerConstants.Views.Pages.ManufacturerDetails.single;

    }

    @RequestMapping("/listOfManufacturerDetails")
    public String listOfManufacturerDetails(Model model) {
        List<ManufacturerDetailsData> detailsDataList = defaultManufacturerDetailsFacade.getListOfManufacturerData();

        model.addAttribute("data", detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.list;
    }


    @RequestMapping("/pagination/{currentPage}")
    public String paginationEx(@PathVariable("currentPage") int currentPage, Model model) {
        List<ManufacturerDetailsData> detailsDataList = defaultManufacturerDetailsFacade.paginationEX(currentPage);

        model.addAttribute("data", detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping("/paginationApi/{currentPage}")
    public String paginationApi(@PathVariable("currentPage") int currentPage, Model model) {
        List<ManufacturerDetailsData> detailsDataList = defaultManufacturerDetailsFacade.paginationAPi(currentPage);

        model.addAttribute("data", detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping("/paginationSort/{currentPage}")
    public String paginationSort(@PathVariable("currentPage") int currentPage, Model model) {
        List<ManufacturerDetailsData> detailsDataList = defaultManufacturerDetailsFacade.paginationApiSort(currentPage);

        model.addAttribute("data", detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping("/paginationOrderByDesc/{currentPage}")
    public String paginationOrderByDesc(@PathVariable("currentPage") int currentPage, Model model) {
        List<ManufacturerDetailsData> detailsDataList = defaultManufacturerDetailsFacade.paginationOrderByDesc(currentPage);

        model.addAttribute("data", detailsDataList);

        return ControllerConstants.Views.Pages.ManufacturerDetails.pagination;
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String getDataByUser(Model model) {
        model.addAttribute("model", new ManufacturerDetailsCommand());

        return ControllerConstants.Views.Pages.ManufacturerDetails.form;
    }

    @ExceptionHandler
    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public String saveModel(@ModelAttribute("model") ManufacturerDetailsCommand detailsModel, Model model) {

        ManufacturerDetailsModel manufacturerDetailsModel = manufacturerDetailsUtil.convertCommandToModel(detailsModel);

        String msg = commandService.saveData(manufacturerDetailsModel);
        model.addAttribute("msg", msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.form;
    }

    @RequestMapping("/removeId/{id}")
    public String removeData(@PathVariable("id") int id, Model model) {
        String msg = commandService.removeData(id);

        model.addAttribute("msg", msg);

        return ControllerConstants.Views.Pages.ManufacturerDetails.remove;

    }




    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String updateForm(@PathVariable("id") int id, Model model)
    {
        ManufacturerDetailsModel manufacturerDetailsModel=defaultManufacturerDetailsService.getManufacturerDetailsById(id);

        model.addAttribute("model",manufacturerDetailsModel);

        commandService.removeData(id);


        return ControllerConstants.Views.Pages.ManufacturerDetails.update;


    }
    @RequestMapping (value ="/updateSave",method = RequestMethod.POST)
    public String saveUpdate(@ModelAttribute("model")ManufacturerDetailsModel manufacturerDetailsModel,Model model)
    {
         String msg=commandService.updateData(manufacturerDetailsModel);

         model.addAttribute("msg",msg);

         return ControllerConstants.Views.Pages.ManufacturerDetails.remove;
    }


}