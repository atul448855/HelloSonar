package com.wordpress.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheetData {

	public Object[][] readData(String filePath, String sheetName) throws IOException {

		Object[][] data = null;
		File file = new File(filePath);
		FileInputStream filename = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(filename);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfColoumns = sheet.getRow(0).getPhysicalNumberOfCells();
		data = new String[numberOfRows - 1][numberOfColoumns];
		for (int i = 1; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColoumns; j++) {

				data[i - 1][j] = null;
				XSSFCell cell = sheet.getRow(i).getCell(j);
				switch (cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:
					data[i - 1][j] = cell.getStringCellValue();
					break;
				}

			}

		}
		workbook.close();
		return data;
	}

}
