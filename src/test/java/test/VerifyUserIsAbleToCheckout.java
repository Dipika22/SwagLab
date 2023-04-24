package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.AddToCartPage;
import pom.CheckoutPage;

public class VerifyUserIsAbleToCheckout extends BaseTest{
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.launchbrowser();
	}
	
	@Test
	public void verifyUserIsAbleToCheckout() throws InterruptedException
	{
		VerifyUserIsAbleToLogin verifyUserIsAbleToLogin = new VerifyUserIsAbleToLogin();
		verifyUserIsAbleToLogin.verifyStandardUserIsAbleToLogin();
		
		Thread.sleep(3000);
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart(0);
		addToCartPage.clickOnViewCart();
		addToCartPage.clickOnCheckout();
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		checkoutPage.enterFirstName("Dipika");
		checkoutPage.enterLastName("B");
		checkoutPage.enterZipCode("422009");
		
        String text = checkoutPage.getPageText();
		
		Assert.assertEquals(text, "Checkout: Your Information");
		
		checkoutPage.clickOnContinueCheckout();
		
		checkoutPage.getCartProductText();
		checkoutPage.getPrice();
		checkoutPage.getTotalPrice();
		
		
		
		 String title = checkoutPage.getOverviewPageText();
			
		Assert.assertEquals(title, "Checkout: Overview");
		
		checkoutPage.clickOnFinish();
		
		String endpage = checkoutPage.getEndPageText();
		Assert.assertEquals(endpage, "Thank you for your order!");
		
		Thread.sleep(3000);
		
		checkoutPage.clickOnBackToHome();
		
		Thread.sleep(3000);
	}

}
