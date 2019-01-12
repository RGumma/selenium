import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelOperations {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi =new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun (2).xlsx");
		Workbook wb =WorkbookFactory.create(fi);
		Sheet S =wb.getSheet("Sheet1");
		Row row;Cell cell;
		for(int r=0;r<S.getLastRowNum()+1;r++)
		{
			row =S.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++)
			{
				
				cell =row.getCell(c);
				if(cell.getCellType()==cell.CELL_TYPE_STRING)
				{
					String str =cell.getStringCellValue();
					System.out.println("The value is"+str);
				}else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC)
				{
				int d =	(int) cell.getNumericCellValue();
				System.out.println("The value is"+d);
				}else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
				{
					boolean b =cell.getBooleanCellValue();
					System.out.println("The boolean value is"+b);
				}
				
			}
			System.out.println();
		}
	}

}
