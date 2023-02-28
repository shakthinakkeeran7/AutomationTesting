package com.automationtesting.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "target/Resource/FeatureFiles", glue = "com.automationtesting.stepDefinitions", dryRun = true,
// plugin = { "pretty" },
// plugin = { "usage" },
// plugin = { "pretty", "html:target/cucumber-reports" },
//        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//                "junit:target/cucumber-reports/Cucumber.xml",
//                "html:target/cucumber-reports"
//        },
		monochrome = true

)

public class TestRunner {
	

}
