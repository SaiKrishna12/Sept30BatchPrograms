package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
		driver.findElement(By.linkText("VIDEOS")).click();
		String acturl=driver.getCurrentUrl();
		if(acturl.contains(expurl))
		{
			System.out.println("Vidoes link working properly");
		}
		else
		{
			System.out.println("Vidoes link working not properly");
		}
		driver.close();
	}

}
