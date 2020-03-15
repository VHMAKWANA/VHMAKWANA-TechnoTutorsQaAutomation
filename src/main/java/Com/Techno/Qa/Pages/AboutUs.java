package Com.Techno.Qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Techno.Qa.Base.TechnoBase;

public class AboutUs extends TechnoBase {
	

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[2]/a")
	WebElement aboutuslink;

	@FindBy(xpath = "//button[@class='btn btn-primary\']")
	WebElement contactuslink;

	@FindBy(xpath = "//input[@name='text-625']")
	WebElement namearea;

	@FindBy(xpath = "//input[@name='email-982']]")
	WebElement emailarea;

	@FindBy(xpath = "//*[@name='text-org']")
	WebElement subject;

	@FindBy(xpath = "//*[@name='textarea-841']")
	WebElement messagearea;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	public AboutUs() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public String titleAboutUs() {
		 aboutuslink.click();
		 return driver.getTitle();
		
	}

}
