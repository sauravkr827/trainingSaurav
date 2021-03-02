package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.springframework.beans.factory.annotation.Autowired;

public class ManufacturerDetailsInitDefaultsInterceptor implements InitDefaultsInterceptor<ManufacturerDetailsModel> {

   @Autowired
   ModelService modelService;

    @Override
    public void onInitDefaults(ManufacturerDetailsModel model, InterceptorContext interceptorContext) throws InterceptorException {

      /*String city="Banglore";
       model.setCity(city);
       modelService.initDefaults(model);*/
        model.setName("nendrasys");


        }
    }

