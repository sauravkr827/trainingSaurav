/*
package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import de.hybris.trainingSaurav.core.customService.impl.DefaultCustomer1Service;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;

public class Customer1LoadInterceptor implements LoadInterceptor<Customer1Model> {

    @Autowired
    DefaultCustomer1Service defaultCustomer1Service;

    @Override
    public void onLoad(Customer1Model model, InterceptorContext ctx) throws InterceptorException {

        defaultCustomer1Service.checkOldAndNew(model);
    }
}
*/
