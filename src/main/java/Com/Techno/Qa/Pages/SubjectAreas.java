package Com.Techno.Qa.Pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.html5.AddLocationContext;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Techno.Qa.Base.TechnoBase;

public class SubjectAreas extends TechnoBase {

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[4]/a")
	WebElement subjectarealink;

	@FindBy(xpath = "//strong[text()='Subjects']")
	WebElement SubjectText;

	@FindBy(xpath = "//*[@id='post-1278']/div[1]/div[2]/div/div/div[2]/a")
	WebElement mathstutor;

	@FindBy(xpath = "//*[@id='post-1278']/div[2]/div[2]/div/div/div[2]/a")
	WebElement Englishtutor;

	@FindBy(xpath = "//*[@id='post-1278']/div[3]/div[2]/div/div/div[2]/a")
	WebElement frenchtutor;

	@FindBy(xpath = "//*[text()='$120 / Month']")
	WebElement learnerpackageamount;

	@FindBy(xpath = "//*[text()='$180 / Month']")
	WebElement Acadamicpackageamount;

	@FindBy(xpath = "(//*[@class='input-text qty text'])[1]")
	WebElement learnerQuantity;

	@FindBy(xpath = "(//*[@class='input-text qty text'])[2]")
	WebElement AcadamicQuantity;

	@FindBy(xpath = "(//button[@class='single_add_to_cart_button button alt'])[1]")
	WebElement AddtocartLearner;

	@FindBy(xpath = "(//button[@class='single_add_to_cart_button button alt'])[2]")
	WebElement Addtocartacadamic;

	@FindBy(xpath = "//*[@class='woocommerce-Price-amount amount']")
	WebElement amount;

	@FindBy(xpath = "//a[@href='/cart/']")
	WebElement viewcart;

	@FindBy(xpath = "//*[@href='/contact/']")
	WebElement contactus;

	public SubjectAreas() {
		PageFactory.initElements(driver, this);
	}

	public String titlesubjectarea() {
		subjectarealink.click();
		return driver.getTitle();

	}

	public Boolean logo() {
		return SubjectText.isDisplayed();
	}

	public void bookmathtutorearner() {
		mathstutor.click();
		learnerpackageamount.isDisplayed();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("0");
		AddtocartLearner.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("1");
		AddtocartLearner.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public void bookmathtutoracadamic() {
		mathstutor.click();
		Acadamicpackageamount.isDisplayed();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("0");
		Addtocartacadamic.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("1");
		Addtocartacadamic.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public Cart mathsLearnerplusacadamic() {
		mathstutor.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("2");
		AddtocartLearner.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("2");
		Addtocartacadamic.click();
		String Total_amount = amount.getText();
		System.out.println("TOTAL AMOUNT--->" + Total_amount);
		viewcart.click();
		return new Cart();

	}

	public void bookenglishtutorlearner() {
		Englishtutor.click();
		learnerpackageamount.isDisplayed();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("0");
		AddtocartLearner.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("1");
		AddtocartLearner.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public void bookenglishtutoracadamic() {
		Englishtutor.click();
		Acadamicpackageamount.isDisplayed();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("0");
		Addtocartacadamic.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("1");
		Addtocartacadamic.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public Cart englishLearnerplusacadamic() {
		Englishtutor.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("2");
		AddtocartLearner.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("2");
		Addtocartacadamic.click();
		String Total_amount = amount.getText();
		System.out.println("TOTAL AMOUNT--->" + Total_amount);
		viewcart.click();
		return new Cart();

	}

	public void bookfrenchtutorlearner() {
		frenchtutor.click();
		learnerpackageamount.isDisplayed();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("0");
		AddtocartLearner.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("1");
		AddtocartLearner.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public void bookfrenchtutoracadamic() {
		frenchtutor.click();
		Acadamicpackageamount.isDisplayed();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("0");
		Addtocartacadamic.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("1");
		Addtocartacadamic.click();
		String price = amount.getText();
		System.out.println(price);

	}

	public Cart frenchLearnerplusacadamic() {
		frenchtutor.click();
		learnerQuantity.clear();
		learnerQuantity.sendKeys("2");
		AddtocartLearner.click();
		AcadamicQuantity.clear();
		AcadamicQuantity.sendKeys("2");
		Addtocartacadamic.click();
		String Total_amount = amount.getText();
		System.out.println("TOTAL AMOUNT--->" + Total_amount);
		viewcart.click();
		return new Cart();

	}

	public void Contact() {

		String parentID = driver.getWindowHandle();

		contactus.click();

		Set<String> windowsID = driver.getWindowHandles();
		int size = windowsID.size();
		System.out.println(size);

		for (String window : windowsID) {
			if (!parentID.equals(window)) {

				driver.switchTo().window(window);
				  System.out.println(driver.getTitle());
				  driver.close();
				

			}
		}
	}
}
