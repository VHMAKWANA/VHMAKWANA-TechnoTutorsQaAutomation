package Com.Techno.Qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

	// RETURNING CUSTOMER

	@FindBy(xpath = "//a[@class='showlogin']")
	WebElement ReturningCustomer;

	@FindBy(xpath = "//input[@id='username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//ul[@class='woocommerce-error']")
	WebElement invallidemail;

	@FindBy(xpath = "//input[@id='rememberme']")
	WebElement RememberMe;

	@FindBy(xpath = "//button[@name='login']")
	WebElement send;

	@FindBy(xpath = "//a[@href='https://www.technotutors.ca/my-account/lost-password/']")
	WebElement Forgetpass;

	@FindBy(xpath = "//input[@id='user_login']")
	WebElement forgetpassemail;

	@FindBy(xpath = "//button[@value='Reset password']")
	WebElement Resetpass;

	@FindBy(xpath = "//ul[@class='woocommerce-error']")
	WebElement ResetpassError;

	// COUPON FOR CHECKOUT PAGE

	@FindBy(xpath = "//a[@class='showcoupon']")
	WebElement couponlink;

	@FindBy(xpath = "//input[@id='coupon_code']")
	WebElement insertcoupon;

	@FindBy(xpath = "//button[@name='apply_coupon']")
	WebElement applycheckoutcoupon;

	@FindBy(xpath = "//ul[@role='alert']")
	WebElement couponerror;

	@FindBy(xpath = "//ul[@class='woocommerce-error']/li")
	WebElement wrongecouponerror;

	// BILLING DETAILS

	@FindBy(xpath = "//input[@id='billing_first_name']")
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='billing_last_name']")
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='billing_company']")
	WebElement Comapany;

	@FindBy(xpath = "//span[@class='woocommerce-input-wrapper']/strong")
	WebElement Contry;

	@FindBy(xpath = "//input[@id='billing_address_1']")
	WebElement Streetname;

	@FindBy(xpath = "//input[@id='billing_address_2']")
	WebElement apparment;

	@FindBy(xpath = "//input[@id='billing_city']")
	WebElement Town;

	@FindBy(xpath = "//span[@id='select2-billing_state-container']")
	WebElement Province;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement InputProvince;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	WebElement postalcode;

	@FindBy(xpath = "//input[@id='billing_phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@id='billing_email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='createaccount']")
	WebElement createaccount;

	@FindBy(xpath = "//input[@id='account_password']")
	WebElement passwordaccount;

	@FindBy(xpath = "//div[@class='woocommerce-password-strength short']")
	WebElement weakpass;

	@FindBy(xpath = "//textarea[@id='order_comments']")
	WebElement otherinfo;

	@FindBy(xpath = "//td[@class='product-name']")
	WebElement productname;

	@FindBy(xpath = "//tr[@class='order-total']")
	WebElement total;

	@FindBy(xpath = "//div[@class='woocommerce-checkout-payment']")
	WebElement Payment;

	@FindBy(xpath = "//label[@for='payment_method_stripe']")
	WebElement Label;

	@FindBy(xpath = "//button[@id='place_order']")
	WebElement placeorder;

	@FindBy(xpath = "(//div[@class='woocommerce-notices-wrapper'])[1]")
	WebElement Errors;

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

	public void Returningstudent() {
		ReturntoShop.click();
		Acadamiccart.click();
		viewcart.click();
		CheckOut.click();
		ReturningCustomer.click();
		UserName.sendKeys("abc");
		Password.sendKeys("abc");
		RememberMe.click();
		send.click();
		System.out.println(invallidemail.getText());
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(ReturningCustomer)).click();
		Forgetpass.click();
		forgetpassemail.sendKeys("abc");
		Resetpass.click();
		System.out.println(ResetpassError.getText());

	}

	public void coupon() throws InterruptedException {
		ReturntoShop.click();
		Acadamiccart.click();
		viewcart.click();
		CheckOut.click();
		couponlink.click();
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(applycheckoutcoupon));
		applycheckoutcoupon.click();
		System.out.println(couponerror.getText());
		couponlink.click();
		insertcoupon.sendKeys("abc");
		applycheckoutcoupon.click();
		Thread.sleep(5000);
		System.out.println(wrongecouponerror.getText());

	}

	public void placeorder() {
		ReturntoShop.click();
		Acadamiccart.click();
		viewcart.click();
		CheckOut.click();
		Firstname.sendKeys("abc");
		Lastname.sendKeys("xyz");
		Comapany.sendKeys("abc");
		System.out.println("country--->>" + Contry.getText());
		Streetname.sendKeys("abc");
		apparment.sendKeys("abc");
		Town.sendKeys("abc");
		Province.click();
		InputProvince.sendKeys("ontario");
		postalcode.sendKeys("abc");
		phone.sendKeys("abc");
		email.sendKeys("abc");
		createaccount.click();
		passwordaccount.sendKeys("a");
	    System.out.println(weakpass.getText());
	    otherinfo.sendKeys("abc");
	    System.out.println(productname.getText());
	    System.out.println(total.getText());
	    Assert.assertTrue(Payment.isDisplayed());
	    Assert.assertTrue(Label.isDisplayed());
	    placeorder.click();
	    System.out.println(Errors.getText());
	    

	}

}
