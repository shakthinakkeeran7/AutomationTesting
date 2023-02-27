package com.automationtesting.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automationtesting.baseClass.BaseClass;
import com.automationtesting.managers.PageObjectManager;

public class StepDefinitions extends BaseClass {

	PageObjectManager pom = new PageObjectManager(driver);
	
	private void newmetho() {
		pom.getHomePage().getBtn_Carts().click();

	}
}
