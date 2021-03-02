package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.util.regex.Pattern;

public class ManufacacturerDetailsPrepareInterceptor implements PrepareInterceptor<ManufacturerDetailsModel> {

    @Override
    public void onPrepare(ManufacturerDetailsModel model, InterceptorContext interceptorContext) throws InterceptorException {

       String name=model.getName();
       String modifiedName="Manufacturer"+name;
       model.setName(modifiedName);
    }
}
