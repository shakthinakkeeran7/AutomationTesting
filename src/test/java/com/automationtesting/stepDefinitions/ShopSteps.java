package com.automationtesting.stepDefinitions;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.pageObjects.Registration;
import com.automationtesting.pageObjects.Shop;

public class ShopSteps {
	TestContext testContext;
	Shop shop;


	public ShopSteps(TestContext context) {
		testContext = context;
		shop = testContext.getPageObjectManager().getShop();
	}

}
