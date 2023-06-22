package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckMyOrders extends BaseClass {

    public void orderDetails(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement list = driver.findElement(By.id("username"));
        list.click();
        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div/div/a[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//tbody/tr[2]/td[6]/a[1]")).click();

    }
}
