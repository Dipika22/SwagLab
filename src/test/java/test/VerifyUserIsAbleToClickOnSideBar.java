package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.AddToCartPage;
import pom.LoginPage;
import pom.SwagLabHomePage;

public class VerifyUserIsAbleToClickOnSideBar extends BaseTest {
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.launchbrowser();
	}
	
	@Test
	public void verifyUserIsAbleToClickOnSideBar() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
		
		Thread.sleep(2000);
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart(0);
		addToCartPage.clickOnViewCart();
		
		Thread.sleep(2000);
		
		addToCartPage.clickOnContinueShopping();
		
		Thread.sleep(2000);
		
		SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
		swagLabHomePage.clickOnSideBar();
		Thread.sleep(2000);
		swagLabHomePage.clickOnAllItem();
		Thread.sleep(2000);
		swagLabHomePage.clickOnCloseMenu();
		Thread.sleep(2000);
		swagLabHomePage.clickOnSideBar();
		swagLabHomePage.clickOnLogout();
		
		String title = swagLabHomePage.getPageText();
		
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test
	public void verifyUserIsAbleToClickOnFilter() throws InterruptedException 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
		
		Thread.sleep(2000);
		
		SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
		swagLabHomePage.clickOnFilter();
		Thread.sleep(2000);
		
		
	}

		
}
