package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filters {
	
	public WebDriver driver;
	
	public Filters(WebDriver driver) {
		this.driver = driver;
	}
	
	By amazonPrime = By.xpath("//li[@id='p_85/10440599031']/span/a/div/label/i");
	By avgCustomerReview = By.xpath("//li[@id='p_72/1318476031']");
	By samsung = By.xpath("//li[@id='p_89/Samsung']/span/a/div");
	By vivo = By.xpath("//li[@id='p_89/Vivo']/span/a/div");
	By price = By.xpath("//li[@id='p_36/1318505031']/span/a");
	By payOnDelivery = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/span[1]/div[1]/div[1]/div[7]/ul[2]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]");
		
	public  WebElement getAmazonPrime() throws InterruptedException {
		
		return driver.findElement(amazonPrime);
	}
	
	public  WebElement getAvgCustomerReview() throws InterruptedException {
		
		return driver.findElement(avgCustomerReview);
	}
	
	public  WebElement getSamsung() throws InterruptedException {
		
		return driver.findElement(samsung);
	}
	
	public  WebElement getVivo() throws InterruptedException {
		
		return driver.findElement(vivo);
	}
	
	public  WebElement getPrice() throws InterruptedException {
		
		return driver.findElement(price);
	}
	
	public  WebElement getPOD() throws InterruptedException {
		
		return driver.findElement(payOnDelivery);
	}
		
}
