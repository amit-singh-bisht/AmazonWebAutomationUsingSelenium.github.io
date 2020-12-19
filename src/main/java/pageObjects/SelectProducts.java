package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProducts {

	public WebDriver driver;
	
	public SelectProducts(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstProduct = By.xpath("//span[contains(text(),'Samsung Galaxy M01s (Blue, 3GB RAM, 32GB Storage)')]");
	By secondProduct = By.xpath("//span[contains(text(),'Samsung Galaxy M11 (Metallic Blue, 3GB RAM, 32GB Storage)')]");
	By thirdProduct = By.xpath("//span[@cel_widget_id=\"MAIN-SEARCH_RESULTS-2\"]/div/div/div[2]/div/div/div/span/a/div/img");
	
	public  WebElement getFirstProduct() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(firstProduct);
	}
	
	public  WebElement getSecondProduct() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(secondProduct);
	}
	
	public  WebElement getThirdProduct() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(thirdProduct);
	}
}
