package technoTutorsQaTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Com.Techno.Qa.Base.TechnoBase;
import Com.Techno.Qa.Pages.AboutUs;
import Com.Techno.Qa.Pages.Contact;
import Com.Techno.Qa.Pages.HomePage;
import Com.Techno.Qa.Utill.customListner;

@Listeners(customListner.class)
public class ContactUsTest extends TechnoBase {

	HomePage homePage;
	AboutUs aboutUs;
	Contact contact;

	public ContactUsTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		contact = homePage.ContactUS();

	}

	@Test(priority = '1')
	public void titlecheck() {
		String title = contact.titlecontact();
		System.out.println(title);
		Assert.assertEquals(title, "Contact – Techno Tutors");

	}
	
	@Test(priority = '2')
	public void textcheck() {
		Boolean B=contact.text();
		Assert.assertTrue(B);
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
