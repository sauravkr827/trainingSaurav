package de.hybris.trainingSaurav.storefront.customValidator;

import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;
import de.hybris.trainingSaurav.storefront.customCommand.CustomRegisterForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component("customRegisterValidator")
public class CustomRegisterValidator extends RegistrationValidator
{

	@Override
	public boolean supports(Class<?> aClass) {
		return super.supports(aClass);
	}

	@Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);

		final CustomRegisterForm registerForm = (CustomRegisterForm) object;

		final boolean newBussinessUser = registerForm.isNewBussinessUser();

		validateIsNewBussinessUser(errors,newBussinessUser);

    }


     	protected void validateIsNewBussinessUser(final Errors errors, final boolean newBussinessUser)
	{
		if (!newBussinessUser)
		{
			errors.rejectValue("newBussinessUser", "register.newBussinessUser.not.accepted");
		}
	}
}
