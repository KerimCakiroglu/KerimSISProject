package com.neotech.testbase;

import com.neotech.pages.LoginPageElements;
import com.neotech.pages.MainPageElements;
import com.neotech.pages.StudentPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static StudentPageElements student;
	public static MainPageElements mainPage;
//	public static PersonalDetailsPageElements personalDetails;
//	public static EmployeeListPageElements employeeList;

	public static void initialize() {

		login = new LoginPageElements();
		student = new StudentPageElements();
		mainPage = new MainPageElements();
//		personalDetails = new PersonalDetailsPageElements();
//		employeeList = new EmployeeListPageElements();

	}
}
