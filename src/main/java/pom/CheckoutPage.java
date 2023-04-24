package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	@FindBy (xpath = "//input[@id='first-name']") private WebElement firstname;
	@FindBy (xpath = "//input[@id='last-name']") private WebElement lastname;
	@FindBy (xpath = "//input[@id='postal-code']") private WebElement zipcode;
	@FindBy (xpath = "//input[@id='continue']") private WebElement continuecheckout;
	@FindBy (xpath = "//button[@id='cancel']") private WebElement cancel;
	@FindBy (xpath = "//span[@class='title']") private WebElement text;
	@FindBy (xpath = "//div[@class='inventory_item_price']") private List<WebElement> price;
	@FindBy (xpath = "//div[@class='inventory_item_name']") private List<WebElement> productname;
	@FindBy (xpath = "//div[@class='summary_info_label summary_total_label']") private WebElement totalprice;
	@FindBy (xpath = "//span[@class='title']") private WebElement overviewtext;
	@FindBy (xpath = "//button[@id='finish']") private WebElement finish;
	@FindBy (xpath = "//h2[@class='complete-header']") private WebElement end;
	@FindBy (xpath = "//button[@id='back-to-products']") private WebElement back;
	
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String name)
	{
		firstname.sendKeys(name);
	}
	public void enterLastName(String last)
	{
		lastname.sendKeys(last);
	}
	public void enterZipCode(String zip)
	{
		zipcode.sendKeys(zip);
	}
	public void clickOnContinueCheckout()
	{
		continuecheckout.click();
	}
	public void clickOnCancel()
	{
		cancel.click();
	}
	public String getPageText()
	{
		return text.getText();
	}
	public void getPrice()
	{
		for(int i = 0 ; i < price.size(); i++)
			System.out.println(price.get(i).getText());
	}
	public void getCartProductText()
	{
		for(int i = 0 ; i < productname.size(); i++)
		System.out.println(productname.get(i).getText());
	}
	public void getTotalPrice()
	{
		System.out.println(totalprice.getText());
	}
	public String getOverviewPageText()
	{
		return overviewtext.getText();
	}
	public void clickOnFinish()
	{
		finish.click();
	}
	public String getEndPageText()
	{
		return end.getText();
	}
	public void clickOnBackToHome()
	{
		back.click();
	}
}
