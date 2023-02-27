package com.automationtesting.managers;

import org.openqa.selenium.WebDriver;

import com.automationtesting.pageObjects.HomePage;
import com.automationtesting.pageObjects.Login;
import com.automationtesting.pageObjects.MyAccount;
import com.automationtesting.pageObjects.Registration;
import com.automationtesting.pageObjects.Shop;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private Login login;
    private MyAccount account;
    private Registration register;
    private Shop shop;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public Login getLogin() {
        return (login == null) ? login = new Login(driver) : login;
    }

    public MyAccount getMyAccount() {
        return (account == null) ? account = new MyAccount(driver) : account;
    }

    public Registration getRegistration() {
        return (register == null) ? register = new Registration(driver) : register;
    }

    public Shop getShop() {
        return (shop == null) ? shop = new Shop(driver) : shop;
    }
}
