package de.hybris.trainingSaurav.core.customCommandService;


import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.util.List;

public interface ManufacturerDetailsCommandService
{
    public String saveData(ManufacturerDetailsModel manufacturerDetailsModel)throws InterceptorException ;
    public String removeData(int id);


    public String updateData(ManufacturerDetailsModel model);
}
