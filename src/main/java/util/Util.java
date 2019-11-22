package util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Util {

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    public String getExcelFile(int row, int cell) throws Exception {
        try {
            FileInputStream ExcelFile = new FileInputStream("C:\\MV8\\SerenityData.xlsx");
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet("Hoja1");
            Cell = ExcelWSheet.getRow(row).getCell(cell);
            String CellData = Cell.getStringCellValue();
            return(CellData);
        } catch (Exception e){
            throw (e);
        }
    }

}
