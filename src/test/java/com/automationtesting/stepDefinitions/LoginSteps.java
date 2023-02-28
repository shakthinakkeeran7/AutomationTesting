package com.automationtesting.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.managers.PageObjectManager;
import com.automationtesting.pageObjects.HomePage;
import com.automationtesting.pageObjects.Login;

public class LoginSteps {
	TestContext testContext;
	Login login;


	public LoginSteps(TestContext context) {
		testContext = context;
		login = testContext.getPageObjectManager().getLogin();
	}

}
