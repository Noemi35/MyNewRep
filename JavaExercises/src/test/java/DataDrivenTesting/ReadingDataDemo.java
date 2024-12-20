package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataDemo {

    public static void main(String args[]) throws IOException {
        FileInputStream file=new FileInputStream("/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/java/DataDrivenTesting/ReadingDataDemo.java");
        //System.getProperty("user.dir")+ ->get the location dinamically
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        int totalRows= sheet.getLastRowNum(); //get the last row number
        int totalCells=sheet.getRow(1).getLastCellNum();
        System.out.println(totalRows); //5
        System.out.println(totalCells); //4

        //get all the rows and cells from curent Workbook
        for(int r=0; r<=totalRows;r++) { //rows start from 0 that's why we put r<=
            XSSFRow currentRow= sheet.getRow(r);
            for(int c=0; c<totalCells; c++) { //cells start from 1 that's why is <
            XSSFCell cell= currentRow.getCell(c);
            System.out.print(cell.toString()+ "\t"); //extract the data and print cell
            }

            System.out.println();


        }

        workbook.close();
        file.close();


    }
}
