package com.automationtesting.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automationtesting.baseClass.BaseClass;
import com.automationtesting.cucumber.TestContext;
import com.automationtesting.enums.Context;
import com.automationtesting.managers.FileReaderManager;
import com.automationtesting.managers.PageObjectManager;

import com.automationtesting.pageObjects.HomePage;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {
	TestContext testContext;
	HomePage homePage;
	FileReaderManager fileReaderManager;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();

	}

	@Given("browser")
	public void browser() {

	testContext.getWebDriverManager().getDriver().get((FileReaderManager.getInstance().getConfigReader().getApplicationUrl()));
		
	}

	@When("get current page title")
	public void get_current_page_title() {

		System.out.println("fgfgfghg");
//System.out.println(driver.getCurrentUrl());
	}

}