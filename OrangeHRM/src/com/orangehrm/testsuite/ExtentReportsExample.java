package com.orangehrm.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsExample {

	
	public static void main(String[] args) throws IOException {
		ExtentReports reports=new ExtentReports("E:\\Sep30Batch\\OrangeHRM\\src\\com\\ornagehrm\\reports\\Samplereport.html",true);
		ExtentTest test=reports.startTest("MySampleTest");
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO,"Launced the browser");
		driver.get("http://google.com");
		test.log(LogStatus.INFO,"Navigated to Google");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\Sep30Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots\\Google.png"));
		Sleeper.sleepTightInSeconds(4);
		test.addScreenCapture("E:\\Sep30Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots\\Google.png");
		reports.endTest(test);
		reports.flush();
	}

}