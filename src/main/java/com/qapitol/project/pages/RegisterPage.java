package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;

public class RegisterPage extends BaseClass {

    public void pageRegister(String userName,String firstName,String mailId,String password,String conformPassword) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("userName")).sendKeys(userName);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("email")).sendKeys(mailId);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]")).sendKeys(conformPassword);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();


    }

}
