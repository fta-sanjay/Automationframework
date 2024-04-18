package com.fta.dataprovider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class DataProviderWithExcel {

    private DataProviderWithExcel(){};
    @DataProvider
    public static Object[][] getdatafromexcel()
    {
        XSSFSheet sheet=null;
        int rownumber,columnnumber=0;
        try {
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/excel/logindetails.xlsx");
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
             sheet = workbook.getSheet("sanjay");
             rownumber=sheet.getLastRowNum();
             columnnumber=sheet.getRow(0).getLastCellNum();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Object[][] data=new Object[rownumber][columnnumber];
        for(int i=1;i<=rownumber;i++)
        {
            for(int j=0;j<columnnumber;j++)
            {
               data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return data;
    }
}
