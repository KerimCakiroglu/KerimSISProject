package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class MainPageElements extends CommonMethods {

	@FindBy(xpath = "//a[normalize-space()='Students']")
	public static WebElement studentTab;

	@FindBy(xpath = "//a[normalize-space()='Staff/Faculty']")
	public static WebElement staffTab;

	@FindBy(xpath = "//a[normalize-space()='Settings']")
	public static WebElement settingTab;

	public MainPageElements() {
		PageFactory.initElements(driver, this);
	}

}