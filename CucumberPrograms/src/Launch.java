import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class Launch {
	static FirefoxDriver driver;
	@BeforeClass
	public static void launchApp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	@AfterClass
	public static void closeApp()
	{
		driver.quit();
	}

}


