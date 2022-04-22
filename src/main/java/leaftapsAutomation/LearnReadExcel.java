package leaftapsAutomation;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LearnReadExcel {
	
	public String[][] readData(String fileName) throws IOException {
		
		// To get into WorkBook location
		XSSFWorkbook ws = new XSSFWorkbook("./Data/" +fileName+ ".xlsx"); // xls - HSSFWorkbook
		
		// To get into sheet 
		XSSFSheet sheet = ws.getSheet("Sheet1"); // using Sheet name best practice 
		//ws.getSheetAt(0); // using index number
		
		/*
		 * // To get into row XSSFRow row = sheet.getRow(1);
		 * 
		 * //To get into cell XSSFCell cell = row.getCell(0);
		 * 
		 * String stringCellValue = cell.getStringCellValue();
		 * System.out.println(stringCellValue);
		 */
		int lastRowNum = sheet.getLastRowNum(); // will exclude the header
		//System.out.println(lastRowNum);
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows(); - Will include the header also
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		//System.out.println(lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum]; 
		
	   for (int i = 1; i <=lastRowNum; i++) {		   
		   
		   for (int j=0;j<lastCellNum;j++) {
				
				  //XSSFRow row = sheet.getRow(i); 
				  //XSSFCell cell = row.getCell(j);
				  //String cellValue = cell.getStringCellValue();
			   String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
		       System.out.println(cellValue);	
		       
		      data[i-1][j] = cellValue; // data[0][0] = " "
		   }
		   
		   System.out.println(" ");
	}
		
		//Always should close the workbook once it done 
				ws.close();
		return data;
		
	}
		
		
		
	}
	
