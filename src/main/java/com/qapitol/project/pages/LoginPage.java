package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    public void pageSignIn() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[2]")).click();
        String value = driver.getCurrentUrl();
        if(value.equals("http://139.59.27.246:3000/login")){
            System.out.println("Login Page Opened");
        }
        driver.findElement(By.id("userNameOrEmail")).sendKeys("vk");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("12345678");
       WebElement btn =  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
       if(btn.isDisplayed()){
           btn.click();
           System.out.println("Successfully Logged In!!");
       }
    }
}
