package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resources.BaseClass;

public class EnterExcelData extends BaseClass{

	@Test
	public void verifyLogin() throws IOException, InterruptedException {
		driverinitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		//Entering Data from Excel sheet.
		FileInputStream file=new FileInputStream("C:\\Users\\salev\\Documents\\Testdata.xlsx");
	    XSSFWorkbook excel=new XSSFWorkbook(file);
	    XSSFSheet sheet=excel.getSheetAt(0);
	    XSSFRow row=sheet.getRow(0);
	    XSSFCell username=row.getCell(0);
	    XSSFCell password=row.getCell(1);   
	    
	    obj.enterUsername().sendKeys(username.getStringCellValue());
	    Thread.sleep(2000);
	    
	    obj.enterPassword().sendKeys(password.getStringCellValue());
	    Thread.sleep(2000);
	    
	    obj.ClickOnLOgin().click();
	    Thread.sleep(2000);
	    
	    obj.ClickOnTryForFree().click();
	    Thread.sleep(2000);
	    
	    System.out.println("Excel Data Retrieve Successfully");
	    driver.quit();
	    
	
	}
}
