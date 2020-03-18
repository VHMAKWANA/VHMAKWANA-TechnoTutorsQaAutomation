package technoTutorsQaTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Techno.Qa.Base.TechnoBase;
import Com.Techno.Qa.Pages.AboutUs;
import Com.Techno.Qa.Pages.HomePage;
import Com.Techno.Qa.Pages.SubjectAreas;
import Com.Techno.Qa.Utill.TestUtill;
import Com.Techno.Qa.Utill.customListner;

@Listeners(customListner.class)
public class AboutUsTest extends TechnoBase {

	HomePage homePage;
	AboutUs aboutUs;

	public AboutUsTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		aboutUs = homePage.aboutUs();

	}
	
	@Test(priority = '1')
	public void titlecheck() {
		String title = aboutUs.titleAboutUs();
		System.out.println(title);
		Assert.assertEquals(title, "About Us – Techno Tutors");

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = TestUtill.getTestData("Login");
		return data;
	}

	@Test(dataProvider = "getdata", priority = '2')
	public void contactus(String name, String email, String subject, String message) {
		aboutUs.ContactUs(name, email, subject, message);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
