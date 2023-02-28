package com.automationtesting.stepDefinitions;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.pageObjects.MyAccount;
import com.automationtesting.pageObjects.Registration;

public class RegistrationSteps {
	TestContext testContext;
	Registration register;


	public RegistrationSteps(TestContext context) {
		testContext = context;
		register = testContext.getPageObjectManager().getRegistration();
	}

}

