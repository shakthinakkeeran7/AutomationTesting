package com.automationtesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	public MyAccount(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	
}
