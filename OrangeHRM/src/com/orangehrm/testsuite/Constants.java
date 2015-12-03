package com.orangehrm.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehtm.utility.ExcelOperations;
import com.orangehtm.utility.Screenshot;


public class Constants {
	ExcelOperations eo=new ExcelOperations();
	Screenshot sc=new Screenshot();
	static RemoteWebDriver driver;
	String emplistPath="E:\\Sep30Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String screenshotPath="E:\\Sep30Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots";
	String dataEnginePath="E:\\Sep30Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}
