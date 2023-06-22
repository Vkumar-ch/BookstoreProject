package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UpdateProfilePage extends BaseClass {

    public void profile(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement list = driver.findElement(By.id("username"));
        list.click();
        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div/div/a[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("confirmPassword")).sendKeys("12345678");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();

    }

}
