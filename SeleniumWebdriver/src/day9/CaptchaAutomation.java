package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptchaAutomation {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		int i=1;
		while(i<10)
		{
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester1");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the cpathca");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] y=x.split(" ");
			int a=Integer.parseInt(y[0]);
			int b=Integer.parseInt(y[2]);
			int c=a+b;
			String str=Integer.toString(c);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Thread.sleep(6000);
			driver.findElement(By.name("op")).click();
			driver.get("http://www.harvard.edu/feedback");
		}
	}

}
