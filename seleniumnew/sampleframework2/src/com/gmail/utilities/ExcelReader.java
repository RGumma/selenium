package com.gmail.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	String excelFilePath;
	Workbook workbook;
	String gsheet;

	public ExcelReader() {

	}

	public ExcelReader(String excelFilePath) throws InvalidFormatException,
			FileNotFoundException, IOException {
		this.excelFilePath = excelFilePath;

		workbook = WorkbookFactory.create(new FileInputStream(excelFilePath));

	}

	public int getRowCount(String sheetName) {

		int rowCount = 0;
		try {
			gsheet = sheetName;
			int index = workbook.getSheet(sheetName).getLastRowNum();
			rowCount = index		+ 1;

		} catch (Exception e) {
			e.printStackTrace();

		}

		return rowCount;

	}

	public String getCellData(String sheetName, int rowNumber, int columnNumber) {

		String cellValue = "";
		try {

			if (workbook.getSheet(sheetName).getRow(rowNumber)
					.getCell(columnNumber).getCellType() == Cell.CELL_TYPE_STRING) {
				//

				cellValue = workbook.getSheet(sheetName).getRow(rowNumber)
						.getCell(columnNumber).getStringCellValue().trim();
			} else {

				cellValue = String.valueOf(
						(int) (workbook.getSheet(sheetName).getRow(rowNumber)
								.getCell(columnNumber).getNumericCellValue()))
						.trim();
			}
		} catch (Exception e) {

			return cellValue;
		}

		return cellValue;
	}

	public void setCellValue(String sheetName, int rowNumber, int columnNumber,
			String value) {

		try {
			
			workbook.getSheet(sheetName).getRow(rowNumber)
					.createCell(columnNumber).setCellValue(value);
			OutputStream outputStream = new FileOutputStream(excelFilePath);
			workbook.write(outputStream);

			outputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String...args){
		
		try {
			ExcelReader reader = new ExcelReader("C://Users//RaviCKota//DevCenter//SeleniumWorkspace//sampleframework2//src//com//gmail//testdata//testdata.xls");
			System.out.println(reader.getRowCount("Sheet1"));
			System.out.println(reader.getCellData("Sheet1", 0, 1));
			reader.setCellValue("Sheet", 1, 5, "123");
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
