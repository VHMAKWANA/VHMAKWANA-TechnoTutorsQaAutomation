package Com.Techno.Qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Techno.Qa.Base.TechnoBase;

public class Contact extends TechnoBase {

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[5]/a")
	WebElement contactuslink;

	@FindBy(xpath = "//strong[text()='Contact Us']")
	WebElement logocontactus;

	@FindBy(xpath = "//*[text()='Techno Tutors']")
	WebElement technotext;

	@FindBy(xpath = "//*[text()=' 55 Town Centre Court, Suite 102 Toronto, ON M1P 4X4']")
	WebElement adresstext;

	@FindBy(xpath = "//*[text()='info@technotutors.com']")
	WebElement emailtext;

	@FindBy(xpath = "//*[text()=' 416-279-1947']")
	WebElement phonenumtext;

	@FindBy(xpath = "//input[@name='text-625']")
	WebElement Name1;

	@FindBy(xpath = "//input[@name='email-982']")
	WebElement Email1;

	@FindBy(xpath = "//input[@name='text-org']")
	WebElement Subject1;

	@FindBy(xpath = "//*[@name='textarea-841']")
	WebElement Message1;

	@FindBy(xpath = "//*[@class='wpcf7-form-control wpcf7-submit']")
	WebElement Send;

	public Contact() {
		PageFactory.initElements(driver, this);
	}

	public String titlecontact() {
		contactuslink.click();
		return driver.getTitle();

	}

	public Boolean logo() {
		return logocontactus.isDisplayed();

	}

	public Boolean adress() {
		return adresstext.isDisplayed();

	}

	public Boolean technotext() {
		return technotext.isDisplayed();

	}

	public Boolean emailtext() {
		return emailtext.isDisplayed();

	}

	public Boolean phonetext() {
		return phonenumtext.isDisplayed();

	}


}
