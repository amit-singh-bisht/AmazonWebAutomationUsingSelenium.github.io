package AmazonSiteTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.DriverInitialize;
import resources.ExtentReporterNG;

public class Listeners extends DriverInitialize implements ITestListener {

	public static Logger log = LogManager.getLogger(Listeners.class.getName());
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	
	public void onTestStart(ITestResult result) {
		String testMethodName =result.getMethod().getMethodName();	
		log.info(" Start of Test: " + testMethodName);	
		test = extent.createTest(testMethodName+" Test ");	
	}

	public void onTestSuccess(ITestResult result) {		
		String testMethodName =result.getMethod().getMethodName();	
		log.info("Success of Test \t" +testMethodName);	
		test.log(Status.PASS, " Test Passed ");
		
		WebDriver diver=getDriver();
		ScreenShot ss= new ScreenShot();
		 
		try {
			ss.takeSuccessScreenShot(testMethodName, diver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(Status.PASS, result.getThrowable());
        test.log(Status.PASS, " Snapshot below: " + test.addScreenCaptureFromPath(System.getProperty("user.dir") + "\\reports\\success\\" + testMethodName + ".png"));	  
	}

	public void onTestFailure(ITestResult result) {
		String testMethodName =result.getMethod().getMethodName();
		log.info("Failure of Test \t" +testMethodName);
		test.fail(result.getThrowable());
		
		WebDriver diver=getDriver();
		ScreenShot ss= new ScreenShot();
		 
		try {
			ss.takeFailureScreenShot(testMethodName, diver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(Status.FAIL, result.getThrowable());
        test.log(Status.FAIL, "Snapshot below: " + test.addScreenCaptureFromPath(System.getProperty("user.dir") + "\\reports\\failure\\" + testMethodName + ".png"));	
	}

	public void onTestSkipped(ITestResult result) {
		String testMethodName =result.getMethod().getMethodName();		
		log.info("Skipped the Test \t" +testMethodName);
		
		WebDriver diver=getDriver();
		ScreenShot ss= new ScreenShot();
		 
		try {
			ss.takeSkippedScreenShot(testMethodName, diver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(Status.SKIP, result.getThrowable());
        test.log(Status.SKIP, "Snapshot below: " + test.addScreenCaptureFromPath(System.getProperty("user.dir") + "\\reports\\skipped\\" + testMethodName + ".png"));	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub  --> unimplemented method	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	--> unimplemented method	
	}	
	
	public void onFinish(ITestContext context) {
		extent.flush();	
	}

}
