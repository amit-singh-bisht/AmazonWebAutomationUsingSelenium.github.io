package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialize {

	public static  WebDriver driver;
	public Properties prop;
	public String parent;
	
	public WebDriver initializeDriver(String browser) throws IOException{
		prop =new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\AMBI\\eclipse-workspace\\AmazonSplitTests\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("Browser_Name");
		
		System.out.println(browserName);
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMBI\\Desktop\\SOFTWARE\\chromedriver.exe");  
			driver=new ChromeDriver();  
		}	else if(browserName.equalsIgnoreCase("firefox")) {
			//code
			
		}	else if(browserName.equalsIgnoreCase("IE"))	{
			//code
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	

}
