package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

public class ManufacturerDetailsValidateInterceptor implements ValidateInterceptor<ManufacturerDetailsModel> {

    @Override
    public void onValidate(ManufacturerDetailsModel model, InterceptorContext interceptorContext) throws InterceptorException {

        boolean valid= Pattern.matches("^[a-zA-Z0-9]+$",model.getName());
        if(!valid)
        {
            throw new InterceptorException("name should be alphanumric");
        }

    }
}
