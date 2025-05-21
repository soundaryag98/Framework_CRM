package com.comcat.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility implements Path
{
	public FileInputStream fis;
	public Workbook book;

	public String getDataFromExcel(String sheetname, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(excelPath);
		book = WorkbookFactory.create(fis);
		String data = book.getSheet(sheetname).getRow(rowNum).getCell(cellNum).toString();
		book.close();

		return data;
	}

	public int getlastrowNum(String sheetname) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(excelPath);
		book = WorkbookFactory.create(fis);
		int rowcount = book.getSheet(sheetname).getLastRowNum();
		book.close();

		return rowcount;
	}

	public void setDataIntoExcel(String sheetname, int rowNum, int cellNum, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(fis);
		book.getSheet(sheetname).getRow(rowNum).createCell(cellNum);

		FileOutputStream fos = new FileOutputStream(excelPath);
		book.write(fos);
		book.close();
	}
}
