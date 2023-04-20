package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.neotech.pages.LoginPageElements;
import com.neotech.pages.MainPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentPageValidationSteps extends CommonMethods {
	@Given("Login as Admin")
	public void login_as_admin() {
		sendText(LoginPageElements.userName, ConfigsReader.getProperty("username"));
		sendText(LoginPageElements.password, ConfigsReader.getProperty("password"));
		jsClick(LoginPageElements.loginButton);

		wait(2);

	}

	@When("Click Student Tab")
	public void click_student_tab() {
		jsClick(MainPageElements.studentTab);
		wait(3);
	}

	@Then("I validate the sub-tabs")
	public void i_validate_the_sub_tabs(DataTable dataTable) {
		// System.out.println(dataTable);
		List<String> expectedList = dataTable.asList();
		List<String> actualList = new ArrayList<>();
		int tabSize = student.studentSubTabs.size();
		for (int i = 1; i <= tabSize; i += 4) {
			actualList.add(student.studentSubTabs.get(i).getText().trim());
		}
		System.out.println("List >>>>" + actualList);
		System.out.println("Expected List >>>" + expectedList);
		Assert.assertEquals("No match ", actualList, expectedList);

	}
}
