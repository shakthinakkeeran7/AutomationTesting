package com.automationtesting.testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.automationtesting.managers.FileReaderManager;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\functionalTests", glue = "com.automationtesting.stepDefinitions", dryRun = false,

// plugin = { "usage" },
//
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"},
//"junit:target/cucumber-reports/Cucumber.xml",
//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:cucumber-reports/report.html"},

monochrome = true
)
class TestRunner {
	@AfterClass
	
	
	public static void writeExtentReport() {
		//System.out.println(FileReaderManager.getInstance().getConfigReader().getReportConfigPath());
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
