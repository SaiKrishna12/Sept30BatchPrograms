package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		LoginusingKeywords keys=new LoginusingKeywords();
		FileInputStream f=new FileInputStream("E:\\Sep30Batch\\SeleniumWebdriver\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			if(action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(action.equals("enterUsername"))
			{
				keys.enterUsername();
			}
			else if(action.equals("clickNext"))
			{
				keys.clickNext();
				Thread.sleep(500);
			}
			else if(action.equals("enterPassword"))
			{
				keys.enterPassword();
			}
			else if(action.equals("clickLogin"))
			{
				keys.clickLogin();
			}
			
		}
	}

}
