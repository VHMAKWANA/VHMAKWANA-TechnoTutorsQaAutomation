package technoTutorsQaTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Techno.Qa.Base.TechnoBase;

import Com.Techno.Qa.Pages.HomePage;
import Com.Techno.Qa.Pages.SubjectAreas;
import Com.Techno.Qa.Utill.customListner;

@Listeners(customListner.class)
public class SubjectAreaTest extends TechnoBase {
	HomePage homePage;
	SubjectAreas subjectAreas;

	public SubjectAreaTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		subjectAreas = homePage.Subjects();

	}

	@Test(priority = 1)
	public void titlecheck() {
		String title = subjectAreas.titlesubjectarea();
		System.out.println(title);
		Assert.assertEquals(title, "Subject Areas – Techno Tutors");

	}

	@Test(priority = 2)
	public void Logocheck() {
		Assert.assertTrue(subjectAreas.logo());

	}

	@Test(priority = 3)
	public void bookamathtutorlearner() {
		subjectAreas.bookmathtutorearner();

	}

	@Test(priority = 4)
	public void bookamathtutoracadamic() {
		subjectAreas.bookmathtutoracadamic();

	}

	@Test(priority = 5)
	public void learnerandacadamicmath() {
		subjectAreas.mathsLearnerplusacadamic();

	}

	@Test(priority = 6)
	public void bookenglishtutorlearner() {
		subjectAreas.bookenglishtutorlearner();

	}

	@Test(priority = 7)
	public void bookenglishtutoracadamic() {
		subjectAreas.bookenglishtutoracadamic();

	}

	@Test(priority = 8)
	public void learnerandacadamicenglish() {
		subjectAreas.englishLearnerplusacadamic();

	}

	@Test(priority = 9)
	public void bookfrenchtutorlearner() {
		subjectAreas.bookfrenchtutorlearner();

	}

	@Test(priority = 10)
	public void bookefrenchtutoracadamic() {
		subjectAreas.bookfrenchtutoracadamic();

	}

	@Test(priority = 11)
	public void learnerandacadamicfrench() {
		subjectAreas.frenchLearnerplusacadamic();

	}

	@Test(priority = 12)
	public void cotactUS() {
		subjectAreas.Contact();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
