package saucedemo.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import saucedemo.base.BaseClass;

public class TestUtils extends BaseClass {
    public void screenshots(String name) {
        String directoryPath = "ScreenShot";
        String filename = name + ".png";
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            directory.mkdirs(); 
        }

        File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File location = new File(directory, filename);
        try {
            Files.copy(scrn.toPath(), location.toPath());
            System.out.println("Screenshot saved successfully at: " + location.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
