import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelWriting {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		String file_path="C:\\Users\\Lenovo\\Desktop\\arun (2).xlsx";
		
		FileInputStream fi =new FileInputStream(file_path);
		Workbook wb =WorkbookFactory.create(fi);
		Sheet S =wb.getSheet("Sheet1");
		S.createRow(5).createCell(5).setCellValue("Selenium");
		FileOutputStream fout =new FileOutputStream(file_path);
		wb.write(fout);
	
	}

}
