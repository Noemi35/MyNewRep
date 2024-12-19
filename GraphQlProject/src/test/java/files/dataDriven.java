package files;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {


    public ArrayList<String> getData(String testcaseName, String sheetName) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        //fileinput argument

        //one column is identified scan entire test case column to identify purchase case

        FileInputStream fis = new FileInputStream("/home/noemi/Desktop/Project IntelliJ/GraphQlProject/src/main/resources/testAPI_POI.xlsx"); //the object creat has the power to read the xls file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                //identify test case column by scanning the entire first row
                Iterator<Row> rows = sheet.iterator(); //iterate through each row; sheet is collection of rows
                Row firstRow = rows.next();
                Iterator<Cell> cell = firstRow.cellIterator(); //row is collection of cells
                int k = 0;
                int column = 0;
                while (cell.hasNext()) {  //if there is a cell next to it
                    Cell value = cell.next(); //moved to the first cell
                    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        //desired column
                        column = k;
                    }
                    k++;
                }
                System.out.println(column);
                //increment after each while loop; goes through each cell of the first row until true "TestCase"
                //one column is identified scan entire test case column to identify purchase case

                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {

                        //after you grabbed purchase test row ==pull all the data of that row and feed into test
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType() == CellType.STRING) {
                                a.add(c.getStringCellValue());
                            } else {

                                a.add(NumberToTextConverter.toText(c.getNumericCellValue())); //int converted to strig; but still prints int
                            }
                            }
                        }
                        //only get sell from 0 column

                    }
                }


            }

            return a;
        }


}


