package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;
	
	public SearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(css="input.nav-input[type=submit]")
	WebElement searchButton;
	
	public WebElement searchText()
	{
		return search;
	}
	
	public WebElement searchButton()
	{
		return searchButton;
	}
}
