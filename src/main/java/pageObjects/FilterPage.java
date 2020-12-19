package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {
	
	public WebDriver driver;
	
	public FilterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='p_85/10440599031']/span/a/div/label/i")
	WebElement primeCheckBox;
	
	
	@FindBy(xpath="//li[@id='p_89/Samsung']/span/a/div/label/i")
	WebElement samsungMobile;
	
	
	@FindBy(xpath="//li[@id='p_36/1318507031']/span/a")
	WebElement priceRange;
	
	@FindBy(xpath="//li[@id='p_n_is_cod_eligible/4931671031']/span/a/div/label/i")
	WebElement payOnDelivery;
	
	
	public WebElement getAmazonPrime() throws InterruptedException
	{
		Thread.sleep(2000);
		return primeCheckBox;
		
	}
	
	public WebElement getSamsungMobile() throws InterruptedException
	{
		Thread.sleep(2000);
		return samsungMobile;
		
	}
	
	
	public WebElement getPriceRange() throws InterruptedException
	{
		Thread.sleep(2000);
		return priceRange;
		
	}
	public WebElement getPayOnDelivery() throws InterruptedException
	{
		Thread.sleep(2000);
		return payOnDelivery;
		
	}
	
}
