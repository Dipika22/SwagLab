package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.AddToCartPage;
import pom.LoginPage;

public class VerifyUserIsAbleToAddProductIntoCart extends BaseTest{
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.launchbrowser();
	}
	
	@Test
	public void verifyUserIsAbleToAddProductIntoCart() throws InterruptedException
	{
		VerifyUserIsAbleToLogin verifyUserIsAbleToLogin = new VerifyUserIsAbleToLogin();
		verifyUserIsAbleToLogin.verifyStandardUserIsAbleToLogin();
		
		Thread.sleep(3000);
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart(0);
		addToCartPage.clickOnViewCart();
		addToCartPage.getCartProductText();
		addToCartPage.getQuantity();
		addToCartPage.getPrice();
		
		String text = addToCartPage.getCartText();
		
		Assert.assertEquals(text, "Your Cart");
	}
	
	@Test
	public void verifyUserIsAbleToAddMultipleProductIntoCart() throws InterruptedException
	{
		VerifyUserIsAbleToLogin verifyUserIsAbleToLogin = new VerifyUserIsAbleToLogin();
		verifyUserIsAbleToLogin.verifyStandardUserIsAbleToLogin();
		
		Thread.sleep(3000);
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart(0);
		
		Thread.sleep(2000);
		
        addToCartPage.clickOnViewCart();
		
		Thread.sleep(2000);
		
		addToCartPage.clickOnContinueShopping();
		
		Thread.sleep(2000);
		
		addToCartPage.clickOnAddToCart(3);
		
		 addToCartPage.clickOnViewCart();
		//addToCartPage.clickOnRemove();
		addToCartPage.getCartProductText();
		addToCartPage.getQuantity();
		addToCartPage.getPrice();
		
		String text = addToCartPage.getCartText();
		
		Assert.assertEquals(text, "Your Cart");
	}

}
