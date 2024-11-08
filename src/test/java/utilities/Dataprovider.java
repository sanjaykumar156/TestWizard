package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	@DataProvider(name="logindata")
	public Object[][] dataprovider() throws IOException{
		String filepath="C:\\Users\\sanjay royal\\eclipse-workspace\\TestWizard\\src\\test\\java\\utilities\\logindata.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row= sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				XSSFCell cell = row.getCell(j);
				CellType celltype= cell.getCellType();
				
				switch(celltype) {
				case STRING:
				data[i-1][j] = cell.getStringCellValue();
				break;
				
				case NUMERIC:
					data[i-1][j] =Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i-1][j] =cell.getBooleanCellValue();
					break;	
				}
			
			}
		}
		workbook.close();
		return data;
	}
}
