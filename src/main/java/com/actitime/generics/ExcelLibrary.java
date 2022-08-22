package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {
	public static String getCellValue(String path,String sheet,int row,int col) throws IOException{
		FileInputStream fis= new FileInputStream(excel_path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		String cellValue= wb.getSheet(excel_sheet).getRow(row).getCell(col).getStringCellValue();
		return cellValue;
		
	}

}
