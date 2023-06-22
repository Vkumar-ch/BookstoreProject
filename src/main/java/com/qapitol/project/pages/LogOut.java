package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogOut extends BaseClass {

    public void pageLogOut() throws InterruptedException {
        WebElement list = driver.findElement(By.id("username"));
        list.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

    }
}
