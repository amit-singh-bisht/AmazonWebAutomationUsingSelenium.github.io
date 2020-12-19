package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartCheckOut {

	public WebDriver driver;
	
	public cartCheckOut(WebDriver driver) {
		this.driver = driver;
	}
	
	By cart = By.cssSelector("#nav-cart-count-container");
	By proceedToBuy = By.cssSelector("#sc-buy-box-ptc-button");
	
	public WebElement add2Cart() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(cart);
	}
	
	public WebElement checkOut() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(proceedToBuy);

	}
}
