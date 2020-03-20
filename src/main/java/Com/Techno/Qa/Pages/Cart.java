package Com.Techno.Qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[4]")
	WebElement Subtotal;

	@FindBy(xpath = "//*[@href='https://www.technotutors.ca/checkout/']")
	WebElement CheckOut;

	public Cart() {
		PageFactory.initElements(driver, this);
	}

	public void CheckOut() {
		ReturntoShop.click();
		Acadamiccart.click();
		Learnercart.click();
		viewcart.click();
		Quantity.clear();
		Quantity.sendKeys("2");
		UpdateCart.click();
		CouponCode.sendKeys("kajal");
		ApplyCoupon.click();
		System.out.println(Error.getText());
		UpdateCart.click();
		System.out.println(Subtotal.getText());
		CheckOut.click();
		System.out.println(driver.getTitle());

	}

}
