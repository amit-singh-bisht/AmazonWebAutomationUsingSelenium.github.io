package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {
	
	public WebDriver driver;
	
	public SearchBar(WebDriver driver) {
		this.driver = driver;
	}

	By searchTextBox = By.cssSelector("#twotabsearchtextbox");
	By searchSubmitText = By.cssSelector("#nav-search-submit-text");
			
	public  WebElement getTextBox() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(searchTextBox);
	}

	public  WebElement getSubmitText() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(searchSubmitText);
	}
}
