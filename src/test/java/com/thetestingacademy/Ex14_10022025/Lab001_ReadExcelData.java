package com.thetestingacademy.Ex14_10022025;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab001_ReadExcelData {
    public static void main(String args[]) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\SaleData.xlsx");
        Workbook a = WorkbookFactory.create(file);

//        for (int k = 0; k > a.getNumberOfSheets(); k++)
//        {
            Sheet S = a.getSheetAt(0);
            System.out.println("\n Sheet Name: " + a.getSheetName(0));

            for (int i = 0; i <= S.getLastRowNum(); i++)
            {
                Row r = S.getRow(i);

                for (int j = 0; j < r.getLastCellNum(); j++)
                {
                    Cell c = r.getCell(j);
                    String value = c.getStringCellValue();
                    System.out.println(value);
                }
                System.out.println();

            }


        }
    }

