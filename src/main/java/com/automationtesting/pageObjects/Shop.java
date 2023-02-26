package com.automationtesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Shop {

	public Shop(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
}
