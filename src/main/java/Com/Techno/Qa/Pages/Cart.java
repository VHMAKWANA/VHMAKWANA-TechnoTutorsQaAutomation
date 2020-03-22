package Com.Techno.Qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Techno.Qa.Base.TechnoBase;

public class Cart extends TechnoBase {

	@FindBy(xpath = "//ul[@id='menu-tt-menu-1']/li[6]/a")
	WebElement cartlink;

	@FindBy(xpath = "//a[@href='https://www.technotutors.ca/shop/']")
	WebElement ReturntoShop;

	@FindBy(xpath = "//a[@href='/shop/?add-to-cart=1609']")
	WebElement Acadamiccart;

	@FindBy(xpath = "//a[@href='/shop/?add-to-cart=1610']")
	WebElement Learnercart;

	@FindBy(xpath = "(//a[@href='https://www.technotutors.ca/cart/'])[3]")
	WebElement viewcart;

	@FindBy(xpath = "//input[@name='coupon_code']")
	WebElement CouponCode;

	@FindBy(xpath = "//button[@name='apply_coupon']")
	WebElement ApplyCoupon;

	@FindBy(xpath = "//*[@class='woocommerce-error']")
	WebElement Error;

	@FindBy(xpath = "//input[@class='input-text qty text']")
	WebElement Quantity;

	@FindBy(xpath = "//button[@name='update_cart']")
	WebElement UpdateCart;

	@FindBy(xpath = "(//a[@class='remove'])[2]")
	WebElement cancel;

	@FindBy(xpath = "//td[@data-title='Subtotal']")
	WebElement Subtotal;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	WebElement CheckOut;

	public Cart() {
		PageFactory.initElements(driver, this);
	}

	public void CheckOut() throws InterruptedException {
		ReturntoShop.click();
		Acadamiccart.click();
		viewcart.click();
		driver.navigate().back();
		Learnercart.click();
		viewcart.click();
		Quantity.clear();
		Quantity.sendKeys("2");

		CouponCode.sendKeys("kajal");
		ApplyCoupon.click();
		System.out.println(Error.getText());
		System.out.println(Subtotal.getText());
		cancel.click();
		Thread.sleep(10000);
		UpdateCart.click();

		System.out.println(Subtotal.getText());

		CheckOut.click();

		System.out.println(driver.getTitle());

	}

}
