package practise_dataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.comcat.crm.generic.fileUtility.ExcelUtility;

public class dataproviderClassForTestCLass {
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		ExcelUtility e= new ExcelUtility();
		int rowcount = e.getlastrowNum("Amazon_product");
		Object[][]ob= new Object[rowcount][2];
		for (int i = 0; i < rowcount; i++) {
			ob[i][0]=e.getDataFromExcel("Amazon_product", rowcount, 0);
			ob[i][1]=e.getDataFromExcel("Amazon_product", rowcount, 2);
		
			
		}
		return ob;
		
	}


}
