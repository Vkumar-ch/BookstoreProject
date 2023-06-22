package com.qapitol.project.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver = null;

Logger logger = Logger.getLogger(BaseClass.class);

    public void setUp(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vinodhkumar.chandaka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("browser has been launched");
    }
    public void tearDown(){
        driver.close();
        logger.info("closing the browser");
    }
}
