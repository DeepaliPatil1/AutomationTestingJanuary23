package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.NewContactPage;
import utility.ReadData;


public class NewContactPageTest extends TestBase   //testbase is parents of all
{
	HomePage homePage;
	NewContactPage newContactPage;

	@BeforeMethod
	public void initialization()
	{
		TestBase.init();
		LoginPage  loginPage = new LoginPage();
		 homePage =loginPage.login();
		//homePage.creatContact();
		 
		 newContactPage = new NewContactPage();
	}
	
	@DataProvider(name = "CreatData")
	public String[][] passData() 
	{
		return ReadData.testData();
	}
	@Test (dataProvider = "CreatData")
	public void validateCreatecontact(String FirstName, String LastName, String MobileNumber, String Address)
	{
		homePage.newContact();
		newContactPage.creatContact(FirstName,LastName,MobileNumber,Address);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
