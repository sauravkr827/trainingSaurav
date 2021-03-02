package de.hybris.trainingSaurav.storefront.util;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSaurav.storefront.customCommand.ManufacturerDetailsCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("manufacturerDetailsUtil")
public class ManufacturerDetailsUtil
{
    @Autowired
    ModelService modelService;

    public ManufacturerDetailsModel convertCommandToModel(ManufacturerDetailsCommand command) {

        ManufacturerDetailsModel model=modelService.create(ManufacturerDetailsModel.class);

        model.setId(command.getId());
        model.setName(command.getName());
        model.setCity(command.getCity());

        return model;

    }

}
