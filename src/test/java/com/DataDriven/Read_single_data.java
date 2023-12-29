package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_single_data {
	private static void read_sing() throws IOException {
		File f = new File(".\\Excel\\User.xls.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals( CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);
			
		}
		w.close();
	}
	
public static void main(String[] args) throws IOException {
	read_sing();

	}

}
