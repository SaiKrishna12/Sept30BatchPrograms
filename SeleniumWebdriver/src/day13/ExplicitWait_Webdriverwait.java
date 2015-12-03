package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait_Webdriverwait {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
	}
	
	@Test
	public void  webdriverwaitTest()
	{
		WebDriverWait mywait=new WebDriverWait(driver, 60);
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
		
	}

}
