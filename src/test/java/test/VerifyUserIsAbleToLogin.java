package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;

public class VerifyUserIsAbleToLogin extends BaseTest{
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.launchbrowser();
	}
	
	
	@Test
	public static void verifyStandardUserIsAbleToLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
		
		String title = loginPage.getPageTitle();
		
		Assert.assertEquals(title, "Products");
	}
	
	@Test
	public static void verifyLockedOutUserIsAbleToLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("locked_out_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
		
		String error = loginPage.getError();
		
		Assert.assertEquals(error, "Epic sadface: Sorry, this user has been locked out.");
	}
	
	@Test
	public static void verifyProblemUserIsAbleToLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("problem_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
			
	}
	
	@Test
	public static void verifyPerformanceGlitchUserIsAbleToLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("performance_glitch_user");
		loginPage.enterPass("secret_sauce");
		loginPage.clickOnLogin();
		
		Thread.sleep(1000);
		
        String title = loginPage.getPageTitle();
		
		Assert.assertEquals(title, "Products");
	
	}

}
