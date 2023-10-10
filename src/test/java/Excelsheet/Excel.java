package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	@Test
	public void Data() throws IOException {
		
		//here we enter excel sheet path.
		FileInputStream f=new FileInputStream("C:\\Users\\salev\\Documents\\Testdata.xlsx");
	
		XSSFWorkbook WorkB=new XSSFWorkbook(f);
		
		XSSFSheet sheet=WorkB.getSheetAt(0);//here we enter sheet no. as index value.
		
		XSSFRow row=sheet.getRow(0);//entering data from row via index value.
		
		XSSFCell cell=row.getCell(0);//entering data from coloumn via index value.	
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));

		
	}
}
