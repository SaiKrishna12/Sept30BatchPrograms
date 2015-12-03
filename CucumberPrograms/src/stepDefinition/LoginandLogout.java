package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginandLogout {
	static FirefoxDriver driver;
	@Given("^the browser is launched and the url is navigated to url$")
	public void the_browser_is_launched_and__navigated_to_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrm.com/index.php/dashboard");
	}

	@When("^the tester enters valid username and passowrd$")
	public void the_tester_enters_valid_username_and_passowrd() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin msg is diplayed$")
	public void welcome_admin_msg_is_diplayed() throws Throwable {
	   String acttext=driver.findElement(By.id("welcome")).getText();
	   String exptext="Welcome Admin";
	   Assert.assertEquals(acttext, exptext);
	}
	
	
	@When("^user clicks on welcome admin link$")
	public void user_clicks_on_welcome_admin_link() throws Throwable {
	    driver.findElement(By.linkText("Welcome Admin")).click();
	    Thread.sleep(3000);
	}

	@When("^also clicks on Logout link$")
	public void also_clicks_on_Logout_link() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^should logout of the app and display the home page$")
	public void should_logout_of_the_app_and_display_the_home_page() throws Throwable {
	   String exptitle="OrangeHRM";
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
	}



}
