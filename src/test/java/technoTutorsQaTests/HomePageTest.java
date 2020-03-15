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

public class HomePageTest extends TechnoBase {

	HomePage homePage;
	AboutUs aboutUs;
	SubjectAreas subjectAreas;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
	}

	@Test(priority = '0')
	public void logotest() {
		System.out.println(homePage.logovalidate());

	}

	@Test(priority = '1')
	public void titletest() {
		String Title = homePage.validatetitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Techno Tutors – Personalized Tutoring Service");
	}

	@Test(priority = '2')
	public void AboutusTest() {
		aboutUs = homePage.Aboutus();
	}

	@Test(priority = '3')
	public void Subjects() {
		subjectAreas = homePage.Subjects();

	}

	@Test(priority = '4')
	public void moremaths() {
		subjectAreas = homePage.mathsmore();

	}

	@Test(priority = '5')
	public void moreenglish() {
		subjectAreas = homePage.englishmore();

	}

	@Test(priority = '6')
	public void morefrench() {
		subjectAreas = homePage.frenchmore();

	}

	@DataProvider
	public Object[][] getdata() {
		Object data[][] = TestUtill.getTestData("Login");
		return data;
	}

	@Test(dataProvider = "getdata", priority = '7')
	public void tutor(String name, String email, String subject, String message) {
		homePage.booktutor(name, email, subject, message);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
