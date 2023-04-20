package com.neotech.steps;

import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends CommonMethods {

	@Given("Go to Neotech Academy Management System LoginPage")
	public void go_to_neotech_academy_management_system_login_page() {

//		setUp();  // done with hooks

		wait(3);

	}

	@When("Write username as Admin")
	public void write_username_as_admin() {
		sendText(LoginPageElements.userName, ConfigsReader.getProperty("username"));
	}

	@When("Write password as Admin")
	public void write_password_as_admin() {
		sendText(LoginPageElements.password, ConfigsReader.getProperty("password"));
	}

	@When("click login button.")
	public void click_login_button() {
		jsClick(LoginPageElements.loginButton);

		wait(2);
	}

	@Then("validate succesfully entry.")
	public void validate_succesfully_entry() {
		// takeScreenshot(getTimeStamp()); done with hooks
	}

	@Then("Quit browser")
	public void quit_browser() {
		// tearDown(); done with hooks
	}
}
