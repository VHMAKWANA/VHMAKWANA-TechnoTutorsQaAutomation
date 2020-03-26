package technoTutorsQaTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Techno.Qa.Base.TechnoBase;
import Com.Techno.Qa.Pages.Cart;
import Com.Techno.Qa.Pages.HomePage;
import Com.Techno.Qa.Pages.SubjectAreas;

public class CartTest extends TechnoBase {
	HomePage homePage;
	Cart cart;

	public CartTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		cart = homePage.cart();

	}

	@Test(priority = 1)
	public void Checkout() throws InterruptedException {
		cart.CheckOut();

	}
	
	
	@Test(priority = 2)
	public void returningstudent()  {
		cart.Returningstudent();

	}
	@Test(priority = 3)
	public void Coupon() throws InterruptedException  {
		cart.coupon();

	}
	
	
	
	@Test(priority = 4)
	public void placeOrder() {
		cart.placeorder();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
