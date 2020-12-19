package pageObjects;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class WindowHandlePage  {
	
	public WebDriver driver;
	
	
	public WindowHandlePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void getWindows() throws InterruptedException {
		
		
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String child:allWindows) 
		{
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#add-to-cart-button")).click();	
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.navigate().refresh();
	}	
	

}
