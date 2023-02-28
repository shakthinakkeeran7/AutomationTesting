package com.automationtesting.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.managers.PageObjectManager;
import com.automationtesting.pageObjects.HomePage;
import com.github.dockerjava.api.model.Driver;

public class HomePageSteps {
	TestContext testContext;
	HomePage homePage;
	public static WebDriver driver;
	PageObjectManager pom = new PageObjectManager(driver);

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	
}