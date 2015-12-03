package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		WebElement sourcedrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropdown=sourcedrop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			String city=dropdown.get(i).getText();
			dropdown.get(i).click();
			WebElement destdrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(destdrop.getText().contains(city))
			{
				System.out.println(city+" is not working correctly");
			}
			else
			{
				System.out.println(city+" is working correctly");
			}
		}
	}

}
