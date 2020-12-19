package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {
	
	public WebDriver driver;
	
	public SelectProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy M51 (Electric Blue, 8GB RAM, 128GB ')]")
	WebElement product1;
	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy M51 (Electric Blue, 6GB RAM, 128GB ')]")
	WebElement product2;
	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy M31s (Mirage Black, 8GB RAM, 128GB ')]")
	WebElement product3;
	
	
	public WebElement getProduct1() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		return product1;
	}
	
	public WebElement getProduct2() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		return product2;
	}
	
	public WebElement getProduct3() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		return product3;
	}
	
	
}
