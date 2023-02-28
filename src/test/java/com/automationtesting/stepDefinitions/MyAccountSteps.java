package com.automationtesting.stepDefinitions;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.pageObjects.Login;
import com.automationtesting.pageObjects.MyAccount;

public class MyAccountSteps {
	TestContext testContext;
	MyAccount myAccount;


	public MyAccountSteps(TestContext context) {
		testContext = context;
		myAccount = testContext.getPageObjectManager().getMyAccount();
	}

}
