package com.app.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {

	@Given("Launch the Application")
	public void launch_the_Application() {
		System.out.println("Browser");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	System.out.println(username);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	System.out.println(password);
	}

	@When("Click the login button")
	public void click_the_login_button() {
	System.out.println("login button");
	}

	@Then("Validate the home page")
	public void validate_the_home_page() {
	System.out.println("home page");
	}
}
