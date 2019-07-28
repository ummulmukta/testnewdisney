package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Dropdown {
	@CucumberOptions(
			plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
			//features = "Cucumber/Cucumber.feature",
					features = "Cucumber/dropdown.feature",
			glue= "com.stepdef")

	public class TestNGRunner extends AbstractTestNGCucumberTests{

}}
