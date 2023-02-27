package com.automationtesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	
	

	public   HomePage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}

	   public WebElement getBtn_Carts() {
		return btn_Carts;
	}

	@FindBy(how = How.CSS, using = ".cart-button")
	    private WebElement btn_Cart;
	   
	   @FindBy(xpath = "//a")
	    private WebElement btn_Carts;
}
