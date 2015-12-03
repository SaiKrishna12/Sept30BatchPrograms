package com.orangehrm.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee extends Constants{
	
	@Test
	public void addEmployeeTest() throws IOException
	{
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		
		String runMode=eo.getCellData(dataEnginePath,0,2,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("AddEmployee test skipped");
		}
		else
		{
			int rowCount=eo.getRowCount(emplistPath, 0);
			for(int i=1;i<=rowCount;i++)
			{
				aep.menu.pim();
				Sleeper.sleepTightInSeconds(5);
				aep.addemployee.click();
				Sleeper.sleepTightInSeconds(5);
				Row r=eo.getRow(emplistPath, 0, i);
				aep.addEmployee(r);
			}
		}
		
	}

}
