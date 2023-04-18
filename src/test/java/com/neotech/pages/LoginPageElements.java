package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(id = "tUsername")
	public static WebElement userName;

	@FindBy(id = "tPassword")
	public static WebElement password;

	@FindBy(xpath = "//input[@id='bLogin']")
	public static WebElement loginButton;

	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}

}
