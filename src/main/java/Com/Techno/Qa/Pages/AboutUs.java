package Com.Techno.Qa.Pages;

import java.util.Set;

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
	WebElement contactus;

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

	public AboutUs() {
		PageFactory.initElements(driver, this);
	}

	public String titleAboutUs() {
		aboutuslink.click();
		return driver.getTitle();

	}

	public void ContactUs(String name, String email, String subject, String message) {
		String parentID = driver.getWindowHandle();
		contactus.click();
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
