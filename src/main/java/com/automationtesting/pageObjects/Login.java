package com.automationtesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	public Login(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}	
}
