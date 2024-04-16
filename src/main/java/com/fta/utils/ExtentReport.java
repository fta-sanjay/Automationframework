package com.fta.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){};

    private static ExtentReports extent;
    public static ExtentTest test;
    public static void getextentreport()
    {
        if(Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Automation report");
            spark.config().setReportName("Extent reports demo");
            extent.attachReporter(spark);
        }
    }
    public static void flushreport() throws IOException {
        if(Objects.nonNull(extent)) {
            extent.flush();
        }
        Desktop.getDesktop().browse(new File("index.html").toURI());
    }
    public static void extenttest(String testcasename)
    {
         test=extent.createTest(testcasename);
    }
}
