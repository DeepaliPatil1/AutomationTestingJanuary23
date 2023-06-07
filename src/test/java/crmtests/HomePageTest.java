package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;

       public class HomePageTest extends TestBase 
 {
	
    	   HomePage homePage ;
    	   
	@BeforeMethod
	public void initialization()
	{
		init();
		LoginPage loginPage = new LoginPage();
		homePage = loginPage.login();
		// homePage = new HomePage();
		
 	   
	}
	
	@Test
	public void validateUserTest()
	{
		homePage.userCheck();
	}
	
	@Test
	public void validateLogoutTest()
	{
		homePage.logout(); 
	}	
	
	@Test
	public void validateHmePageLogoutTest()
	{
		homePage.logoCheck();
	}	
	
	@Test
	public void validateRedirectionOfCreatContactTest()
	{
		homePage.newContact();
	}
	
	@Test
	public void validateRedirectionOfCreatCompanyTest()
	{
		homePage.creatCompany();
	}
	
	@Test
	public void validateRedirectionOfCreatDealTest()
	{
		homePage.creatDeal();
	}
	
	@Test
	public void validateRedirectionOfCreatTaskTest()
	{
		homePage.creatTask();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
