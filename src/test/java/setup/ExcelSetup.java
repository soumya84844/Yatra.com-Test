package setup;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSetup {
	
	FileInputStream fileInput;
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	String data;
	
	public String getExcelData(String sheetName, int r, int c) throws Exception {
		
		fileInput = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\data.xlsx");
		
		workbook = new XSSFWorkbook(fileInput);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(r);
		cell = row.getCell(c);
		
		data = cell.toString();
		
		workbook.close();
		fileInput.close();
		
		return data;
		
	}

}
