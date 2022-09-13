package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {

		File src = new File("D:\\Book1.xlsx");
//		To load that particular location in order to perform the action
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		
		String value = sh1.getRow(2).getCell(1).getStringCellValue();
		
		
		System.out.println(value);
		
		DataFormatter df = new DataFormatter();
		String numericstringvalue = df.formatCellValue(sh1.getRow(2).getCell(0));
		System.out.println(numericstringvalue);

	}

}
