package Com.Techno.Qa.Pages;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Techno.Qa.Base.TechnoBase;

public class HomePage extends TechnoBase {

	@FindBy(xpath = "//img[@style='top:11px;']")
	WebElement logo;

	@FindBy(xpath = "//ul[@id=\"menu-tt-menu-1\"]/li[1]/a")
	WebElement HomeButton;

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[2]/a")
	WebElement aboutuslink;

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[3]/a")
	WebElement Facilitylink;

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[4]/a")
	WebElement subjectarealink;

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[5]/a")
	WebElement contactuslink;

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[6]/a")
	WebElement cartlink;

	@FindBy(xpath = "//*[@class='tp-rightarrow tparrows uranus  noSwipe']")
	WebElement Rightarrow;

	@FindBy(xpath = "//*[@class='tp-leftarrow tparrows uranus  noSwipe']")
	WebElement Leftarrow;

	@FindBy(xpath = "//div[@id=\"slide-2-layer-6\"]/a")
	WebElement Aboutus;

	@FindBy(xpath = "//div[@id=\"slide-2-layer-7\"]/a")
	WebElement Subjects;

	@FindBy(xpath = "//div[@class=\"vc_btn3-container  math-btn vc_btn3-right\"]/a")
	WebElement MathsMore;

	@FindBy(xpath = "//div[@class=\"vc_btn3-container  eng-btn vc_btn3-right\"]/a")
	WebElement EnglishMore;

	@FindBy(xpath = "//div[@class=\"vc_btn3-container  fr-btn vc_btn3-right\"]/a")
	WebElement FrenchMore;

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

	@FindBy(xpath = "(//span[@class='wpcf7-not-valid-tip'])[1]")
	WebElement Errorname;

	@FindBy(xpath = "(//span[@class='wpcf7-not-valid-tip'])[2]")
	WebElement Erroremail;

	@FindBy(xpath = "(//span[@class='wpcf7-not-valid-tip'])[3]")
	WebElement Errorsubject;

	@FindBy(xpath = "(//span[@class='wpcf7-not-valid-tip'])[1]")
	WebElement Errormessage;

	@FindBy(xpath = "//*[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")
	WebElement Errorsend;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public Boolean logovalidate() {
		return logo.isDisplayed();

	}

	public String validatetitle() {
		return driver.getTitle();

	}

	public AboutUs aboutUs() {
		Actions action = new Actions(driver);
		action.moveToElement(aboutuslink).click().build().perform();
		return new AboutUs();
	}

	public Facility facility() {
		Actions action = new Actions(driver);
		action.moveToElement(Facilitylink).click().build().perform();
		return new Facility();

	}

	public Contact ContactUS() {
		Actions action = new Actions(driver);
		action.moveToElement(contactuslink).click().build().perform();
		return new Contact();

	}

	public AboutUs Aboutus() {

		Actions action = new Actions(driver);
		action.moveToElement(HomeButton).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(Aboutus));
		action.moveToElement(Aboutus).click().build().perform();
		return new AboutUs();

	}

	public SubjectAreas Subjects() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(subjectarealink));
		action.moveToElement(subjectarealink).click().build().perform();
		return new SubjectAreas();
	}

	public Cart cart() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(subjectarealink));
		action.moveToElement(cartlink).click().build().perform();
		return new Cart();
	}

	public SubjectAreas mathsmore() {

		Actions action = new Actions(driver);
		action.moveToElement(MathsMore).click().build().perform();
		return new SubjectAreas();

	}

	public SubjectAreas englishmore() {

		Actions action = new Actions(driver);
		action.moveToElement(EnglishMore).click().build().perform();
		return new SubjectAreas();

	}

	public SubjectAreas frenchmore() {

		Actions action = new Actions(driver);
		action.moveToElement(FrenchMore).click().build().perform();
		return new SubjectAreas();

	}
	public void errorbooktutor() {

		Name1.sendKeys("");
		Email1.sendKeys("");
		Subject1.sendKeys("");
        Message1.sendKeys("");
        Send.click();
        System.out.println(Errorname.getText());
        System.out.println(Erroremail.getText());
        System.out.println(Errorsubject.getText());
        System.out.println(Errormessage.getText());
        System.out.println(Errorsend.getText());
	}
	
   //CONTACT US FOR BOOKING
	
	public void booktutor(String name, String email, String subject, String message) {

		Name1.sendKeys(name);
		Email1.sendKeys(email);
		Subject1.sendKeys(subject);
        Message1.sendKeys(message);
        Send.click();
		
		if (Errorname.isDisplayed()) {

			System.out.println(Errorname.getText());
		
		}
		else if(Erroremail.isDisplayed()) {
			System.out.println(Erroremail.getText());
		}
		else if(Errorsubject.isDisplayed()) {
			System.out.println(Errorsubject.getText());
		}
		else if(Errormessage.isDisplayed()) {
			System.out.println(Errormessage.getText());
		}
		else if(Errorsend.isDisplayed()) {
			System.out.println(Errorsend.getText());
		}
		else {
			
			System.out.println();
		}
		

	}

}
