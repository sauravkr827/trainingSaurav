package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSaurav.core.customService.impl.DefaultCustomer1Service;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;

public class Customer1PrepareInterceptor implements PrepareInterceptor<Customer1Model> {

   @Autowired
   ModelService modelService;

   @Autowired
   DefaultCustomer1Service defaultCustomer1Service;

   @Override
    public void onPrepare(Customer1Model model, InterceptorContext interceptorContext) throws InterceptorException {

      /* defaultCustomer1Service.checkOldAndNew(model);*/

    }
}
