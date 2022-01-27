package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Meghana M S
 *
 */
public class ExcelLib {

	static String excelPath = "./TestResources/testData1.xlsx";

	/**
	 * This method is used to read date from an excel file
	 *  @param sheetName Provide the sheetName where you have the test data
	 * @param rowNum    Provide the row number where you have the data
	 * @param cellNum   Provide the cell number where you have the test data
	 * @return Returns data from that respective sheet,row,cell in the form of string
	 */

	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/***
	 * This method is used to read boolean data from an excel file
	 * @param sheetName sheetName Provide the sheetName where you have the test data
	 * @param rowNum  Provide the row number where you have the data
	 * @param cellNum Provide the cell number where you have the test data
	 * @return Returns data from that respective sheet,row,cell in the form of boolean
	 */
	public static Boolean readBooleanDataString (String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}
	/***
	 * This method is used to read Numeric data from an excel file
	 * @param sheetName sheetName Provide the sheetName where you have the test data
	 * @param rowNum  Provide the row number where you have the data
	 * @param cellNum Provide the cell number where you have the test data
	 * @return Returns data from that respective sheet,row,cell in the form of double
	 */
	public static double readNumericDataString (String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	/***
	 * This method is used to read Local date and time  data from an excel file
	 * @param sheetName sheetName Provide the sheetName where you have the test data
	 * @param rowNum  Provide the row number where you have the data
	 * @param cellNum Provide the cell number where you have the test data
	 * @return Returns data from that respective sheet,row,cell in the form of LocalDateTime
	 */
	public static LocalDateTime readLocalTimeDate (String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
	}

}
