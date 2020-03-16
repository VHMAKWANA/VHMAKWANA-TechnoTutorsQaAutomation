package Com.Techno.Qa.Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Techno.Qa.Base.TechnoBase;

public class Facility extends TechnoBase {
	
	
	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[3]/a")
	WebElement facilitylink;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement aboutus;
	
	@FindBy(xpath = "//input[@name='text-625']")
	WebElement namearea;

	@FindBy(xpath = "//input[@name='email-982']")
	WebElement emailarea;

	@FindBy(xpath = "//*[@name='text-org']")
	WebElement subjectarea;

	@FindBy(xpath = "//*[@name='textarea-841']")
	WebElement messagearea;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	public Facility() {
		PageFactory.initElements(driver, this);
	}

	public String titlefacility() {
		facilitylink.click();
		return driver.getTitle();

	}

	public void facility(String name, String email, String subject, String message) {
		String parentID = driver.getWindowHandle();
		aboutus.click();
		Set<String> windowsID = driver.getWindowHandles();
		int size = windowsID.size();
		System.out.println(size);

		for (String window : windowsID) {
			if (!parentID.equals(window)) {
				driver.switchTo().window(window);
			}

			namearea.sendKeys(name);
			emailarea.sendKeys(email);
			subjectarea.sendKeys(subject);
			messagearea.sendKeys(message);
			submit.click();

		}
	}
}


	
	
	
	
	
	
	
	


