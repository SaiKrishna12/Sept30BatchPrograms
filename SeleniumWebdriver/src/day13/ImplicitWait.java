package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
	}
	
	@Test
	public void  implicitwaitTest() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a")).click();
	}

}
