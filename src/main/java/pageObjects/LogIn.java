package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class LogIn {
	
	public WebDriver driver;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
	}
 	
	By username = By.cssSelector("#ap_email");
	By clickContinue = By.cssSelector("#continue");
	By password = By.cssSelector("#ap_password");
	By login = By.cssSelector("#signInSubmit");
	
	public  WebElement getUsername() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(username);
	}
	
	public  WebElement getContinue() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(clickContinue);
	}
	
	public  WebElement getPassword() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(password);
	}
	
	public  WebElement getLogin() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(login);
	}
}
