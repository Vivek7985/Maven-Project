package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataExcel {

	

	public class Excel {

		@Test
		public void Data() throws IOException, InterruptedException {
			
			//here we enter excel sheet path.
			//for importing file.
			FileInputStream f=new FileInputStream("C:\\Users\\salev\\Documents\\Testdata.xlsx");
		   
			//To save file
			XSSFWorkbook WorkB=new XSSFWorkbook(f);
			
			XSSFSheet sheet=WorkB.getSheetAt(0);//here we enter sheet no. as index value.
			
			XSSFRow row=sheet.getRow(0);//entering data from row via index value.
			
			XSSFCell cell1=row.getCell(0);//entering data from coloumn1 via index value.	
            XSSFCell cell2=row.getCell(1);//entering data from coloumn2 via index value.				
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			WebElement Username=driver.findElement(By.id("username"));
			Thread.sleep(2000);
			Username.click();
			Thread.sleep(2000);
			
			Username.sendKeys(cell1.getStringCellValue());
			Thread.sleep(1000);
			
			WebElement Password=driver.findElement(By.name("pw"));
			Password.click();
			Thread.sleep(1000);
			
			Password.sendKeys(cell2.getStringCellValue());
			Thread.sleep(1000);
			
			WebElement Login=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
			Login.click();
			driver.quit();
			
		}
}
}