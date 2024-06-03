package ExcelUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelUtil {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;

    //This method is to set the File path and to open the Excel file,
// Pass Excel Path and Sheetname as Arguments to this method
    public static void setExcelFile(String Path,String SheetName) throws Exception {
        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(Path);
            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        } catch (Exception e){
            throw (e);
        }
    }

//This method is to read the test data from the Excel cell,
// in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{
        try{
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            DataFormatter dataFormatter = new DataFormatter();
            String CellData = dataFormatter.formatCellValue(Cell);

            return CellData;
        }catch (Exception e){
            return " ";
        }
    }

//This method is to write in the Excel cell, Row num and Col num
// are the parameters

    public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{
        try{
            Row  = ExcelWSheet.getRow(RowNum);
            Cell = Row.getCell(ColNum);
            //Cell = Row.get
            if (Cell == null) {
                Cell = Row.createCell(ColNum);
                Cell.setCellValue(Result);
            } else {
                Cell.setCellValue(Result);
            }

            // Constant variables Test Data path and Test Data file name
            FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData + Constants.File_TestData);

            ExcelWBook.write(fileOut);

            fileOut.flush();
            fileOut.close();

        }catch(Exception e){
            throw (e);
        }
    }

    public static int getNumberRows() throws Exception{
        try {
            int totalRows = ExcelWSheet.getLastRowNum();
            return totalRows;
        }
        catch(Exception e){
            throw (e);
        }
    }

    public static void expectedVsActualOutput(String output, int rowNum, int colNum) throws Exception {
        if (output.equals(ExcelUtil.getCellData(rowNum, colNum))) {
            ExcelUtil.setCellData(output, rowNum, colNum + 1);
            ExcelUtil.setCellData("Passed", rowNum, colNum + 2);
        } else {
            ExcelUtil.setCellData(output, rowNum, colNum + 1);
            ExcelUtil.setCellData("Failed", rowNum, colNum + 2);
        }
    }
}
