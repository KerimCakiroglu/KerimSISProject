package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[1]/tbody/tr[1]/td/table/tbody/tr/td")
	public List<WebElement> studentSubTabs;

	@FindBy(id = "bAdd")
	public WebElement addStudentBtn;

	@FindBy(id = "tStateId")
	public WebElement stateId;

	@FindBy(id = "tLastName")
	public WebElement lastName;

	@FindBy(id = "tFirstName")
	public WebElement firstName;

	@FindBy(id = "tMiddleName")
	public WebElement middleName;

	@FindBy(id = "tSuffix")
	public WebElement suffix;

	@FindBy(css = "input#tSSN.tBoxMid")
	public WebElement ssn;

	@FindBy(id = "tEmail")
	public WebElement email;

	@FindBy(id = "tBirthDay")
	public WebElement birthDay;

	@FindBy(id = "gender_list")
	public WebElement gender;

	@FindBy(id = "lunchType")
	public WebElement lunch;

	@FindBy(id = "ddEthnicity_list")
	public WebElement ethnicity;

	@FindBy(xpath = "//button[@data-id=\"ddRaceNew\"]")
	public WebElement raceBtn;

	@FindBy(xpath = "//div[@class=\"dropdown-menu open\"]/ul/li")
	public List<WebElement> race;

	@FindBy(id = "tLabel")
	public WebElement label;

	@FindBy(id = "cGradeLevel_list")
	public WebElement gradeLevel;

	@FindBy(id = "tPassword")
	public WebElement password;

	@FindBy(id = "tBusInfo")
	public WebElement busInfo;

	@FindBy(id = "bSubmit")
	public WebElement submitBtn;

	@FindBy(id = "photoChange")
	public WebElement changePicture;

	@FindBy(id = "fileUpload")
	public WebElement uploadFile;

	@FindBy(name = "bSubmit")
	public WebElement submitPicture;

	@FindBy(id = "sImage")
	public WebElement uploadSuccess;

	@FindBy(id = "bStatusChange")
	public WebElement enrollBtn;

	@FindBy(name = "bEnroll")
	public WebElement enrollBtn2;

	@FindBy(id = "lStatus")
	public WebElement currentStatus;

	@FindBy(name = "students$students")
	public WebElement totalStudent;

	@FindBy(linkText = "Parental")
	public WebElement parentalSubTab;

	@FindBy(name = "dGradeLevel$list")
	public WebElement selectGrade;

	@FindBy(name = "gradeSections$list")
	public WebElement selectClass;

	@FindBy(name = "studentStatus$list")
	public WebElement selectStatus;

	public StudentPageElements() {
		PageFactory.initElements(driver, this);
	}

}
