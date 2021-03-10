package com.qa.TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Devlabs\\Batch 2\\BroadridgeBatch2\\SDETIBMCucumber\\src\\test\\java\\com\\qa\\Features\\AmazonFeatures.feature",
		glue="com.qa.StepDefinitions",
		dryRun=false,
		strict=true,
		monochrome = true,
		format = {"pretty", "html:test-output"},
		tags= {"@SmokeTest , @End2EndTest"}
		
		)


public class AmazonTestRunner {

}
