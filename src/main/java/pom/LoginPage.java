package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='user-name']") private WebElement username;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']") private WebElement login;
	@FindBy (xpath = "//span[text()='Products']") private WebElement title_1;
	@FindBy (xpath = "//h3[text()='Epic sadface: Sorry, this user has been locked out.']") private WebElement error;
	@FindBy (xpath = "//img[@class='inventory_item_img']") private List<WebElement> img;
	
	
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterUserName(String name)
    {
    	username.sendKeys(name);
    }
    public void enterPass(String pass)
    {
    	password.sendKeys(pass);
    }
    public void clickOnLogin()
    {
    	login.click();
    }
    public String getPageTitle()
    {
    	return title_1.getText();
    }
    public String getError()
    {
    	return error.getText();
    }
    public void getImage()
    {
          	
    	for(int i=0 ;i>=img.size(); i++)
        img.get(i);
		
    }
    
}
