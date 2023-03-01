package com.automationtesting.testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.automationtesting.managers.FileReaderManager;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\functionalTests", glue = "com.automationtesting.stepDefinitions", dryRun = false,

plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true
)
class TestRunner {
	
	
	

}
