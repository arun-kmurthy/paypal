package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FirstPage;
import wdMethods.ProjectMethods;

public class TC001_PayPalSignUP extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_PayPalSignUp";
		testDescription="Sign Up";
		testNodes="Sign up";
		category="Smoke";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC001";
	}	
	
	@Test(dataProvider="fetchData")
	public void signUp(String country,String Email,String pwd) {
		new FirstPage()
		.clickSignUp()
		.clickCheckBox()
		.clickNext()
		.selectCountry(country)
		.enterEmail(Email)
		.enterpassword(pwd)
		.enterReenterPassword(pwd)
		.clickContinue();
	}
}
