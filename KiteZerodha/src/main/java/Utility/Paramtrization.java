package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramtrization {
	public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	
    FileInputStream file=new FileInputStream("C:\\Users\\Vishal Rananavare\\vishal1\\KiteZerodha\\src\\test\\resources\\LOGINDATA.xlsx");
    String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
    return value;


}
}




