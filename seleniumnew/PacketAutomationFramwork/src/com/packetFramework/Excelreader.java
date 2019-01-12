package com.packetFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excelreader {

	String filename;
	Workbook workbook;
	String gsheet;
	
	public Excelreader(String filename) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		this.filename= filename;
		
		FileInputStream fi= new FileInputStream(filename);
	
			workbook =  WorkbookFactory.create(fi);
			
	}
	
	
	public int getrowcount(String sheetname){
		
		int rowcount=0;
		
		gsheet= sheetname;
		
		int index= workbook.getSheet(sheetname).getLastRowNum() +1;
		
		return rowcount;
	}
				
		
	public String getcelldata(String sheetname, int rownumber, int columnnumber){
		
		String cellvalue = "";
		
		if(workbook.getSheet(sheetname).getRow(rownumber).getCell(columnnumber).getCellType()== Cell.CELL_TYPE_STRING){
		
			
			cellvalue = workbook.getSheet(sheetname).getRow(rownumber).getCell(columnnumber).getStringCellValue().trim();
			
			
			
		}else{
			
			cellvalue=  String.cellvalue((int)(workbook.getsheetname)
			
			
			return cellvalue
		
					
					
	}
		
		
		
		
	
	}
			
			
			
	
	
}


