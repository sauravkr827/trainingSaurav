package de.hybris.trainingSaurav.storefront.controllers.customController;


import de.hybris.trainingSaurav.core.model.LatestProductComponentModel;
import de.hybris.trainingSaurav.facades.customFacade.impl.DefaultManufacturerDetailsFacade;
import de.hybris.trainingSaurav.storefront.controllers.ControllerConstants;
import de.hybris.trainingSaurav.storefront.controllers.cms.AbstractAcceleratorCMSComponentController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("LatestProductComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.LatestProductComponent)
public class LatestProductComponentController extends AbstractAcceleratorCMSComponentController<LatestProductComponentModel>
{
Logger logger=Logger.getLogger(LatestProductComponentController.class);

 @Autowired
 DefaultManufacturerDetailsFacade defaultManufacturerDetailsFacade;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, LatestProductComponentModel component) {

        model.addAttribute("data", defaultManufacturerDetailsFacade.getProductData(component.getLatestProduct()));
        logger.info("in controller");
    }






    public DefaultManufacturerDetailsFacade getDefaultManufacturerDetailsFacade() {
        return defaultManufacturerDetailsFacade;
    }

    public void setDefaultManufacturerDetailsFacade(DefaultManufacturerDetailsFacade defaultManufacturerDetailsFacade) {
        this.defaultManufacturerDetailsFacade = defaultManufacturerDetailsFacade;
    }
}
