package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

public class ManufacturerDetilsLoadInterceptor implements LoadInterceptor<ManufacturerDetailsModel> {

    @Override
    public void onLoad(ManufacturerDetailsModel model, InterceptorContext ctx) throws InterceptorException {

        String city=model.getCity();

        model.setCity("from="+city);



    }
}
