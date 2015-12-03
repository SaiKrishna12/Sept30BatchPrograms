package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class CapturingScreenshot extends Constants{
	@Test
	public void screenshotTest() throws IOException
	{
		String runMode=eo.getCellData(dataEnginePath,0,3,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Screenshot test skipped");
		}
		else
		{
			sc.takingscreenshot(driver,screenshotPath+"\\addemp.png");
		}
	}

}
