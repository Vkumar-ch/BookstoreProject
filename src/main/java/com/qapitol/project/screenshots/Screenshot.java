package com.qapitol.project.screenshots;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot extends BaseClass {

    public void takeScreenshot(){
        TakesScreenshot src = (TakesScreenshot)driver;
        File sourceShot = src.getScreenshotAs(OutputType.FILE);
        File destShot = new File("C:\\Users\\vinodhkumar.chandaka\\IdeaProjects\\BookstoreProject\\src\\test\\java\\resources\\screenshot.jpeg");
        try {
            FileHandler.copy(sourceShot,destShot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
