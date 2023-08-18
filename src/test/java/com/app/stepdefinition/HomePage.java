package com.app.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {
	
	@Given("Launch the URL")
	public void launch_the_URL() {
	   System.out.println("url");
	}

	@When("Enter user {string}")
	public void enter_user(String user) {
		System.out.println(user);
	}

	@When("Enter pass {string}")
	public void enter_pass(String pass) {
		System.out.println(pass);
	}

	@Then("Validate the {string}")
	public void validate_the(String status) {
		System.out.println(status);
	}

}
