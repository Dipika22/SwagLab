package pom;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy (xpath = "//button[text()='Add to cart']") private List<WebElement> addcart;
	@FindBy (xpath = "//button[text()='Remove']") private WebElement remove;
	@FindBy (xpath = "//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy (xpath = "//div[@class='inventory_item_name']") private List<WebElement> text;
	@FindBy (xpath = "//span[@class='shopping_cart_badge']") private WebElement quantity;
	@FindBy (xpath = "//button[@id='continue-shopping']") private WebElement continueshopping;
	@FindBy (xpath = "//button[@id='checkout']") private WebElement checkout;
	@FindBy (xpath = "//span[text()='Your Cart']") private WebElement yourcart;
	@FindBy (xpath = "//div[@class='inventory_item_price']") private List<WebElement> price;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int clickOnAddToCart(int i)
	{
	   //for(i = 0 ; i < 6; i++)
	   addcart.get(i).click();
	   return i;
	}
	public void clickOnRemove()
	{
		remove.click();
	}
	public void clickOnViewCart()
	{
		cart.click();
	}
	public void getCartProductText()
	{
		for(int i = 0 ; i < text.size(); i++)
		System.out.println(text.get(i).getText());
	}
	public void getQuantity()
	{
		System.out.println(quantity.getText());
	}
	public void clickOnContinueShopping()
	{
		continueshopping.click();
	}
	public void clickOnCheckout()
	{
		checkout.click();
	}
	public String getCartText()
	{
		return yourcart.getText();
	}
	public void getPrice()
	{
		for(int i = 0 ; i < price.size(); i++)
			System.out.println(price.get(i).getText());
	}
}
