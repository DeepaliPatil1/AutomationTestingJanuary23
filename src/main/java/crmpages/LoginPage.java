package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{
	//driver.findElement(By.xpath()).sendeys();
	// to initialize webelement
	public LoginPage()
	{
		PageFactory.initElements(driver, this); // this used current class represent
	}
	
	//WebElements repository
	
	
	@FindBy (name = "username")
	WebElement usernameTxtBox;
	
	@FindBy (name = "password")
	WebElement passwordTextBox;
	
	@FindBy (xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy (xpath = "(//img[@class='img-responsive'])[1]")
    WebElement logo;
	
	@FindBy (xpath = "//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
	WebElement signuplink;
	
	//Action
	public HomePage login()
	{
		usernameTxtBox.sendKeys(prop.getProperty("username"));
		passwordTextBox.sendKeys(prop.getProperty("password"));
		
		loginBtn.click();
		
		//HomePage object1 = new HomePage(); // 1st way validate data use
		//return object1;
		
		return new HomePage(); //2nd way validate data
		
		
	}
	
	public boolean logoStatus()
	{
		boolean status = logo.isDisplayed();
		return status;
	}
	public boolean linkStatus()
	{
		boolean status = signuplink.isDisplayed();
		return status;
	}
	

}
