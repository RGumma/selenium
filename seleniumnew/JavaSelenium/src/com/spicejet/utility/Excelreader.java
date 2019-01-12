package com.spicejet.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excelreader {

	 Workbook workbook;
	

	public void excelReader(String pathofexcelfile) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream(pathofexcelfile);
		workbook = WorkbookFactory.create(fis);
	}
	

 public int getrowcount(String sheetName){
	
	 int rowcount =0;
	 
	rowcount= workbook.getSheet(sheetName).getLastRowNum() +1;
	
	return rowcount;

 }

 
 public String getcelldata(String sheetName, int rowNumber, int columnNumber){
 
	 String cellvalue = null;
	 
 if(workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getCellType()==Cell.CELL_TYPE_STRING){
	 
	 
	  cellvalue= workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getStringCellValue().trim();
	 
 }else{
	 
	 cellvalue = String.valueOf(workbook.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getNumericCellValue()).trim();
	 

}
 
 
 return cellvalue;
 
 }


}








