package de.hybris.trainingSaurav.storefront.customCommand;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

public class CustomRegisterForm extends RegisterForm
{
   private boolean newBussinessUser;

    public boolean isNewBussinessUser() {
        return newBussinessUser;
    }

    public void setNewBussinessUser(boolean newBussinessUser) {
        this.newBussinessUser = newBussinessUser;
    }
}
