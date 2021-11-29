package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature",
					glue="com.swiggy.testscripts",
					tags="@regression and @pizza"
					)

public class TestRunner extends AbstractTestNGCucumberTests{

}


