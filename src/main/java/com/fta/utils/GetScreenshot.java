package com.fta.utils;

import com.fta.driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalTime.now;

public final class GetScreenshot {

    private GetScreenshot(){};

    public static void getScreenshotWithTimestamp(){
        File source=((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
       // String timestamp= String.valueOf(System.currentTimeMillis());
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = now.format(formatter);
        String path=System.getProperty("user.dir")+"/screenshots/"+timestamp+"image.png";
        try {
            FileUtils.copyFile(source,new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
