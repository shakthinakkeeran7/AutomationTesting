package com.automationtesting.stepDefinitions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.automationtesting.cucumber.TestContext;
import com.automationtesting.managers.WebDriverManager;




public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

@Before
    public void BeforeSteps() {
        System.out.println("$$$ BEFORE $$$");
		
    }

   @After
    public void AfterSteps() {
        System.out.println("$$$ AFTER $$$");
        testContext.getWebDriverManager().closeDriver();
    }

}