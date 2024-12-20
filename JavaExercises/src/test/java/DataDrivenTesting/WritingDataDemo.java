package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataDemo {
    public static void main(String args[]) throws IOException {


        FileOutputStream file=new FileOutputStream("/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/java/DataDrivenTesting");
        //System.getProperty("user.dir")+
        XSSFWorkbook workbook=new XSSFWorkbook(); //create an object for a workbook
//        XSSFSheet sheet= workbook.createSheet("Data");
//        XSSFRow row1= sheet.createRow(1);
//        row1.createCell(0).setCellValue("welcome");
//        row1.createCell(1).setCellValue("java");
//        row1.createCell(2).setCellValue("selenium");
//
//        XSSFRow row2= sheet.createRow(2);
//        row2.createCell(0).setCellValue("python");
//        row2.createCell(1).setCellValue("19");
//        row2.createCell(2).setCellValue("selenium 34");
//
//        XSSFRow row3= sheet.createRow(2);
//        row3.createCell(0).setCellValue("ruby");
//        row3.createCell(1).setCellValue("23");
//        row3.createCell(2).setCellValue("selenium 20");

        //write data in specific row; random row, random cell ->update

        XSSFSheet sheet1= workbook.createSheet("Specific Row");
       XSSFRow row= sheet1.createRow(3);
       XSSFCell cell=row.createCell(1);
       cell.setCellValue("welcome");


        //dynamic data from the user

        XSSFSheet sheet= workbook.createSheet("Dynamic Data");

        Scanner sc=new Scanner(System.in); //get the data from the user
        System.out.println("How many rows do you want?");
        int noOfRows=sc.nextInt();

        System.out.println("How many cells do you want?");
        int noOfCells=sc.nextInt();

        for(int r=0; r<=noOfRows; r++) {
          XSSFRow currentRow =sheet.createRow(r);
            for(int c=0; c<=noOfCells;c++) {
                XSSFCell currentCell=currentRow.createCell(c);
                currentCell.setCellValue(sc.next()); //data captured from the user
            }
        }


        workbook.write(file); //attach workbook to the file
        workbook.close();
        file.close();
        System.out.println("The file is created...");









    }
}
