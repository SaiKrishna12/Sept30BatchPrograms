import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Links extends Launch{
	@Test
	public void linksTest()
	{
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
		driver.quit();
	}


}
