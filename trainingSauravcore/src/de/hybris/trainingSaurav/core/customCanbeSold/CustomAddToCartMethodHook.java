package de.hybris.trainingSaurav.core.customCanbeSold;

import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.hook.CommerceAddToCartMethodHook;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class CustomAddToCartMethodHook implements CommerceAddToCartMethodHook {
    @Override
    public void beforeAddToCart(CommerceCartParameter parameters) throws CommerceCartModificationException {


        Boolean canBeSold=parameters.getProduct().getCanBeSold();

        if (canBeSold == false) {
                throw new CommerceCartModificationException("===========********* Product can not be sold ************=======");

            } //conn

    }

    @Override
    public void afterAddToCart(CommerceCartParameter parameters, CommerceCartModification result) throws CommerceCartModificationException {

    }
}
