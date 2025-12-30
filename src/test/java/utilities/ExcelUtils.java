package utilities;

/*import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.google.common.collect.Table.Cell;*/

//import com.google.common.collect.Table.Cell;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	Workbook wb;
    XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) {
        try {
            FileInputStream fis = new FileInputStream(excelPath);
            wb = WorkbookFactory.create(fis);
            sheet = (XSSFSheet) wb.getSheet(sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellData(int rowNum, int colNum) {
    	
        //return sheet.getRow(row).getCell(col).getStringCellValue();
    	
    	  try {
              Row row = sheet.getRow(rowNum);
              if (row == null) {
                  return ""; // Empty if row is null
              }
              Cell cell = row.getCell(colNum);
              if (cell == null) {
                  return ""; // Empty if cell is null
              }

              // Use DataFormatter to convert all cell types to String
              DataFormatter formatter = new DataFormatter();
              return formatter.formatCellValue(cell);

          } catch (Exception e) {
              e.printStackTrace();
              return ""; // Return empty string if any exception occurs
          }
    }
    public int getRowCount() {
        return sheet.getLastRowNum();
    }
}


