package com.app.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\AIITE Academy\\Project Class\\Cucumber\\July_Cucumber\\July_Cucumber\\src\\test\\java\\com\\app\\feature",
glue="com.app.stepdefinition",
dryRun=false,
monochrome=true,
tags="@smoke1")

public class Runner {

}
