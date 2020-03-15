package technoTutorsQaTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Techno.Qa.Base.TechnoBase;
import Com.Techno.Qa.Pages.AboutUs;
import Com.Techno.Qa.Pages.HomePage;
import Com.Techno.Qa.Pages.SubjectAreas;
import Com.Techno.Qa.Utill.customListner;

@Listeners(customListner.class)
public class AboutUsTest extends TechnoBase {
	
	HomePage homePage;
	AboutUs aboutUs;
	
	
	public  AboutUsTest() {
		 super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage= new HomePage();
		aboutUs=homePage.aboutUs();
		
		}
	
	@Test(priority = '1')
	public void titlecheck() {
	 String title=aboutUs.titleAboutUs();
		System.out.println(title);
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
