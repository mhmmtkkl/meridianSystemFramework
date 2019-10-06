package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTheDatafromExcal {

	public static String getData(String excelName , String Sheets , String WhichData) throws Exception {
		
		String path =GlobalVariableReader.getData(excelName);
		
		FileInputStream inStream = null;
		
		try {
			inStream = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		}
		
		Workbook workbook = WorkbookFactory.create(inStream);
		
		Sheet sheet = workbook.getSheet(Sheets);
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String result = null;
		
//		we need to get the total count of the row in the excel sheet
		 int totalNumofRow = sheet.getPhysicalNumberOfRows();
		System.out.println(totalNumofRow);
		for(int i = 0 ; i < totalNumofRow ;i++) {
			
			row = sheet.getRow(i);
			
			int cellCount = row.getPhysicalNumberOfCells();
			System.out.println(cellCount);
			for(int j =0 ; j<cellCount ; j++) {
				
				cell = row.getCell(j);
				
				if(cell.toString().equals(WhichData)) {
					row = sheet.getRow(i+1);
					
					cell = row.getCell(j);
					
					result=cell.toString();
					System.out.println("result "+result);
					break;
				}
				
			}
			 	
		}
		 	
	return result;	
	
	}
	
	
}
