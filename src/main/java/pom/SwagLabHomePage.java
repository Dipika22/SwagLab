package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SwagLabHomePage {
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']") private WebElement menu;
    @FindBy (xpath = "//a[@id='inventory_sidebar_link']") private WebElement allitem;
    @FindBy (xpath = "//a[@id='about_sidebar_link']") private WebElement about;
    @FindBy (xpath = "//a[@id='logout_sidebar_link']") private WebElement logout;
    @FindBy (xpath = "//a[@id='reset_sidebar_link']") private WebElement reset;
    @FindBy (xpath = "//button[@id='react-burger-cross-btn']") private WebElement close;
    @FindBy (xpath = "//div[@class='login_logo']") private WebElement text;
    @FindBy (xpath = "//select[@class='product_sort_container']") private WebElement filter;
    @FindBy (xpath = "//select[@class='product_sort_container']") private WebElement filtertext;
    
    
    
    public SwagLabHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnSideBar()
    {
    	menu.click();
    }
    public void clickOnAllItem()
    {
    	allitem.click();
    }
    public void clickOnAbout()
    {
    	about.click();
    }
    public void clickOnLogout()
    {
    	logout.click();
    }
    public void clickOnRestApp()
    {
    	reset.click();
    }
    public void clickOnCloseMenu()
    {
    	close.click();
    }
    public String getPageText()
    {
    	return text.getText();
    }
    
    public void clickOnFilter()
    {
    	//filter.click();
    	Select select = new Select(filter);
    	select.selectByVisibleText("Price (low to high)");
    }
   
}
