package day11;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("This is for registration app");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	@BeforeMethod
	public void func1()
	{
		System.out.println("abc");
	}
	@AfterMethod
	public void fun2()
	{
		System.out.println("xyz");
	}
}
