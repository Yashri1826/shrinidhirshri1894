package MVN_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Maven_datadriven {
	public static Object[][] readData(String Sheet) throws EncryptedDocumentException, IOException {
	
	File file=new File("./src/test/resources/TestData/TestData.xlsx");
	FileInputStream fls=new FileInputStream(file);
	Workbook Wb= WorkbookFactory.create(fls);
	Sheet S = Wb.getSheet(Sheet);
	
	int RC= S.getPhysicalNumberOfRows();
	int CC=S.getRow(0).getPhysicalNumberOfCells();
	
	
	Object[][] Data= new Object[RC-1][CC];
	for(int i=1;i<RC;i++) {
		for(int j=0;j<CC;j++) {
			Data[i-1][j]=S.getRow(i).getCell(j).toString();
		}
	}
	  
	  for(int i=0;i<RC-1;i++) { for(int j=0;j<CC;j++) {
	  System.out.println(Data[i][j]); } }
	 
	return Data;
	
}
public static  void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	//Object data[][]=WorkingWithMultipleRead.readData();
	//System.out.println(Arrays.deepToString(Data));
	readData("Login");
	

 }
}
