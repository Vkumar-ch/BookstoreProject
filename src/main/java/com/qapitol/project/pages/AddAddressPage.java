package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class AddAddressPage extends BaseClass {

    public void details(String doorNo,String village,String city,String state,String pinCode,String mobileNo) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        driver.findElement(By.id("addressLine1")).sendKeys(doorNo);
        driver.findElement(By.id("addressLine2")).sendKeys(village);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("state")).sendKeys(state);
        Thread.sleep(1000);
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
//        javascriptExecutor.executeScript("window.scrollBy(0,300");
        Robot robot  = new Robot();
        robot.mouseWheel(3);
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select select = new Select(country);
        select.selectByValue("IN");
        if(country.isSelected()){
            System.out.println("Country Selected");
        }
        Thread.sleep(1000);
        driver.findElement(By.id("postalCode")).sendKeys(pinCode);
        driver.findElement(By.id("phone")).sendKeys(mobileNo);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Add New Address')]")).click();

        WebElement addressElement = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[1]/div[2]/div/div/div[1]/div/input"));
        boolean sel = addressElement.isDisplayed();
        if(sel == true){
            addressElement.click();
        }
    }
}
