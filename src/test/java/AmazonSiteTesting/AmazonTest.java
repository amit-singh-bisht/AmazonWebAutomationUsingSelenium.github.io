package AmazonSiteTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.WindowHandlePage;
import resources.DriverInitialize;
import resources.excelSheet;
import pageObjects.FilterPage;
import pageObjects.SearchPage;
import pageObjects.SelectProductPage;

public class AmazonTest extends DriverInitialize {
	
	public static Logger log = LogManager.getLogger(AmazonTest.class.getName());
	
	excelSheet read = new excelSheet();
	ArrayList<String> data;
	
	@BeforeTest
	public void getExcel() throws IOException {
		excelSheet read = new excelSheet();
		data = read.getData();
	}
	
	@Test
	public void homePageNavigation() throws IOException {
				
		driver =initializeDriver(data.get(0));
		log.info(" Driver gets initialized ");
		
		String urlName = data.get(1);	//prop.getProperty("url");
		driver.get(urlName);
		log.info(urlName + " is opened ");
		
		driver.manage().window().maximize();
		log.info(" window is maximized ");
	}
	
	@Test(dependsOnMethods= {"homePageNavigation"})
	public void search() {
		SearchPage search = new SearchPage(driver);
			
		search.searchText().sendKeys(data.get(2));
		log.info(" search bar field is clicked where mobile is given as input ");
		
		search.searchButton().click();
		log.info(" search button is clicked ");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(dependsOnMethods= {"search"})
	public void filter() throws InterruptedException{
		FilterPage filter = new FilterPage(driver);
		
		filter.getAmazonPrime().click();
		log.info(" amazon prime is selected ");
		
		filter.getSamsungMobile().click();
		log.info(" samsung mobile is selected ");
		
		filter.getPriceRange().click();
		log.info(" price filter is selected ");
		
		filter.getPayOnDelivery().click();
		log.info(" pay on delivery is selected ");		
	}
	
	@Test(dependsOnMethods= {"filter"})
	public void selectProduct() throws InterruptedException {
		SelectProductPage select = new SelectProductPage(driver);
		
		select.getProduct1().click();
		log.info(" first product is opened in new tab ");
		
		select.getProduct2().click();
		log.info(" second product is opened in new tab ");
		
		select.getProduct3().click();
		log.info(" third product is opened in new tab ");
	}
	
	@Test(dependsOnMethods= {"selectProduct"})
	public void addToCart() throws InterruptedException {	
		WindowHandlePage w = new WindowHandlePage(driver);
		
		w.getWindows();
		log.info(" add products to cart ");
	}
	
	@Test(dependsOnMethods= {"addToCart"})
	public void login()
	{
		//SignInPage si = new SignInPage(driver);
		//si.getGoToLogIn().click();
		log.info(" goto login button is clicked ");
		
		//si.getEamailInput().sendKeys(data.get(3));
		log.info(" registered email is entered ");
		
		//si.getContinueButton().click();
		log.info(" continue buton is clicked ");
		
		//si.getPassword().sendKeys(data.get(4));
		log.info(" password is entered ");
		
		//si.getLogIn().click();
		log.info(" login button is clicked ");
	}	
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		log.info(" driver is closed ");
		driver.quit();
	}
	
	
}
