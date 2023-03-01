package com.automationtesting.cucumber;

import com.automationtesting.managers.*;
import com.automationtesting.pageObjects.*;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private ScenarioContext scenarioContext;
    private FileReaderManager fileReaderManager;

    public TestContext(){
        webDriverManager = new WebDriverManager();
   
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
    
}