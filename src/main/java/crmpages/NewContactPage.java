package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase
{
	//initialization
	public NewContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//webelements repository
	@FindBy (id = "first_name")
	WebElement firstName;
	
	@FindBy (id = "surname")
	WebElement lastName;
	
	@FindBy (id = "mobile")
	WebElement mobileNr;
	
	@FindBy (name = "address")
	WebElement addressName;
	
	@FindBy (xpath = "//form[@id='contactForm']/descendant::input[@value='Save']")
	WebElement saveBtn;
	
	
	
	
	
	//action
	public void creatContact(String FN, String LN, String MobNr, String Address)
	{
		firstName.sendKeys(FN);
		lastName.sendKeys(LN);
		mobileNr.sendKeys(MobNr);
		addressName.sendKeys(Address);
		saveBtn.click();
	
	}
  
}
