package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	XSSFWorkbook wb;

	public Exceldataprovider() {

		File src = new File("./Applicationtestdata/Appdata.xls");

		try {

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());

		}

	}

	public String getdata(int sheetindex, int row, int column) {

		String data = wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();

		return data;

	}

	public String getdata(String sheetname, int row, int coloumn) {

		String data = wb.getSheet(sheetname).getRow(row).getCell(coloumn).getStringCellValue();

		return data;
	}

}
