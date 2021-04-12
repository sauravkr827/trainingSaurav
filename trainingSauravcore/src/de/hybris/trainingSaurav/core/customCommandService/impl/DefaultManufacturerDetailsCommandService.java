package de.hybris.trainingSaurav.core.customCommandService.impl;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.impl.InterceptorExecutionPolicy;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.trainingSaurav.core.customCommandService.ManufacturerDetailsCommandService;
import de.hybris.trainingSaurav.core.customService.impl.DefaultManufacturerDetailsService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class DefaultManufacturerDetailsCommandService implements ManufacturerDetailsCommandService {


    ModelService modelService;

    @Resource
    SessionService sessionService;

    @Autowired
    DefaultManufacturerDetailsService defaultManufacturerDetailsService;




    @Override
    public String saveData(ManufacturerDetailsModel manufacturerDetailsModel)throws InterceptorException {

        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_TYPES,
                ImmutableSet.of(InterceptorExecutionPolicy.InterceptorType.PREPARE,InterceptorExecutionPolicy.InterceptorType.VALIDATE));
                sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody()
//        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS, ImmutableSet.of("manufacturerDetailValidateInterceptor"));
//        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody()

        {
            @Override
            public void executeWithoutResult()
            {
                modelService.save(manufacturerDetailsModel);    // save successful - all validate interceptors are disabled
            }
        });

        return "Data inserted Succussfully";
    }


  /*  @Override
    public String saveData(ManufacturerDetailsModel manufacturerDetailsModel){

        modelService.save(manufacturerDetailsModel);    // save successful - all validate interceptors are disabled

        return "Data inserted Succussfully";
    }*/





    @Override
    public String removeData(int id) {
        final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS, ImmutableSet.of("manufacturerDetailsRemoveInterceptor1"));
       sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody()

        {
            @Override
            public void executeWithoutResult()
            {
                ManufacturerDetailsModel manufacturerDetailsModel=defaultManufacturerDetailsService.getManufacturerDetailsById(id);
                modelService.remove(manufacturerDetailsModel); // remove successful - all validate interceptors are disabled
            }
        });

        return "data removed successfully";
    }




    @Override
    public String updateData(ManufacturerDetailsModel model)
    {
        modelService.save(model);
        return "data updated successfully";
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }



    private SessionExecutionBody inSession(Runnable action)
    {
        return new SessionExecutionBody()
        {
            @Override
            public void executeWithoutResult()
            {
                action.run();
            }
        };
    }
}


    /*final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS, ImmutableSet.of("manufacturerDetailValidateInterceptor"));



    @Override
    public String saveData(ManufacturerDetailsModel manufacturerDetailsModel)
    {
        modelService.save(manufacturerDetailsModel);

        return "Data Successfully Inserted";
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
*/