package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginPage extends BaseClass {
          @Test
	public void verifyLogin() throws InterruptedException, IOException {
		
        //This method is taken from src/main/java-resources-BaseClass.
		driverinitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Retrieve data from Excel sheet.
		
		//To store Excel FIle we create this method.
		FileInputStream Excelfile=new FileInputStream("C:\\Users\\salev\\Documents\\Testdata.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(Excelfile);
		
		//To retrieve data from Sheet NO 1.
		XSSFSheet sheet=Workbook.getSheetAt(0);//put index value here.
		
		XSSFRow row=sheet.getRow(0);//Put data from Row 1.
		
		XSSFCell cell1=row.getCell(0);//Data in column 1.index value
		XSSFCell cell2=row.getCell(1);//Data in column 2.index value
		
		//Login element by ID
		WebElement Username=driver.findElement(By.id("username"));
		Username.click();
		Thread.sleep(2000);
		
		//Entering data from Excel Column 1.
		Username.sendKeys(cell1.getStringCellValue());
		Thread.sleep(1000);
		
		//Password element by ID.
		WebElement Password=driver.findElement(By.id("password"));
		Password.click();
		Thread.sleep(2000);
		
		//Entering data from Excel column2.
		Password.sendKeys(cell2.getStringCellValue());
		Thread.sleep(1000);
		
		//LOgin Element by ID.
		WebElement Login=driver.findElement(By.id("Login"));
		Login.click();
		Thread.sleep(2000);
		
		System.out.println("Done");
		driver.quit();
		
		
		
	}
	
}
