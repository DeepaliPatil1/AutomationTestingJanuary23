package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.Util;

public class HomePage extends TestBase
{
	
	// to initialize erb eements

    public  HomePage()
    {
    	PageFactory.initElements(driver, this);
    	
	}
	
	//WebElement repository
	
	@FindBy (xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement user;
	
	@FindBy (xpath = "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
	WebElement LogoutBtn;
	
	@FindBy (xpath = "//td[text()='CRMPRO']")
	WebElement logo;
	
	@FindBy (xpath = "//a[text()='Contacts']")
	WebElement contacts;
	
	@FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a ")
	WebElement newContact;
	
	@FindBy (xpath = "//a[@title='Companies']")
	WebElement company;
	
	@FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/ul/li[1]/a")
	WebElement newcompany;
	
	@FindBy (xpath = "//a[@title='Deals']")
	WebElement deals;
	
	@FindBy (xpath = "//a[@title='New Deal']")
	WebElement newDeals;
	
	@FindBy (xpath = "//a[@title='Tasks']")
	WebElement tasks;
	
	@FindBy (xpath = "//a[@title='New Task']")
	WebElement newTask;
	
	
	//Action
    
    public String userCheck()
    {
    	Util.switchToMainPanelFrame();
    	String ueserName = user.getText();
    	return ueserName;
    	
    }
    
    public void logout()
    {
    	Util.switchToMainPanelFrame();
    	LogoutBtn.click();
    }
    
    public boolean logoCheck()
    {
    	Util.switchToMainPanelFrame();
    	boolean status = logo.isDisplayed();
    	return status;
    			
    }
    
    public void  newContact()
    {
    	Util.switchToMainPanelFrame();
    	Util.mouseHoverAction(contacts);
    	 newContact.click();
    	
    }
    
    public void creatCompany()
    {
    	Util.switchToMainPanelFrame();
   	    Util.mouseHoverAction(company);
   	     newcompany.click();
   	     	
    }
    public void creatDeal()
    {
    	Util.switchToMainPanelFrame();
    	Util.mouseHoverAction(deals);
    	newDeals.click();
    	
    }
    
    public void creatTask()
    {

    	Util.switchToMainPanelFrame();
    	Util.mouseHoverAction(tasks);
    	newTask.click();
    	
    	
    }

}
