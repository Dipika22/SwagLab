package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
public static String getExcelData (String name, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Automation\\Naaptol\\src\\main\\resources\\TestData.xlsx");
		String data =WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

}
