package pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.DriverInitialize;

public class WindowHandles extends DriverInitialize{

	public WebDriver driver;
	
	public WindowHandles(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getWindows() throws InterruptedException {
		parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#add-to-cart-button")).click();	//addToCart_feature_div	
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		driver.navigate().refresh();
	}	
}
