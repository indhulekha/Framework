package com.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL implements IAutoConst {
	static FileInputStream fis;

	public static int getRow(String path, String sheet) {
		int rc = -1;

		try {
			fis = new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			rc = w.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rc;

	}

	public static int getCol(String path, String sheet) {
		int gc = -1;
		try {
			fis = new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			gc = w.getSheet(sheet).getRow(0).getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gc;

	}

	public static String getData(String path, String Sheet, int row, int col) {
		String value = "";
		try {
			fis = new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			value = w.getSheet(Sheet).getRow(row).getCell(col).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static void createExcel( String sheetName, String path) throws IOException {
		
		Workbook w = new XSSFWorkbook();
		Sheet sh = w.createSheet(sheetName);
		//path =  XLPATH +sheetName + ".xlsx";
		sh.createRow(0).createCell(0).setCellValue("TCName");
		sh.getRow(0).createCell(1).setCellValue("TCstatus");
		FileOutputStream  fileOutput = new FileOutputStream(path);
		w.write(fileOutput);
		fileOutput.close();
		w.close();
	}
	
	public static void setData(String Filename, String Testcasestatus, int row, int cell, String sheet,String path)
			throws Exception
	{
		FileInputStream  fis= new FileInputStream(path);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		sh.createRow(row).createCell(cell).setCellValue(Filename);
		cell++;
		sh.getRow(row).createCell(cell).setCellValue(Testcasestatus);
		FileOutputStream fio = new FileOutputStream(path);
		wb.write(fio);
		wb.close();
		
	}

}
