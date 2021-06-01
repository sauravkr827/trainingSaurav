package de.hybris.trainingSaurav.core.customCanbeSold;

import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.impl.CommerceAddToCartStrictStrategy;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;

public class CustomCanBeSold extends CommerceAddToCartStrictStrategy
{
    @Override
    protected void validateAddToCart(CommerceCartParameter parameters) throws CommerceCartModificationException {
        super.validateAddToCart(parameters);

        Boolean canBeSold=parameters.getProduct().getCanBeSold();

        if (canBeSold==false)
        {
            throw new CommerceCartModificationException("===========********* Product can not be sold ************=======");
        }


    }
}
