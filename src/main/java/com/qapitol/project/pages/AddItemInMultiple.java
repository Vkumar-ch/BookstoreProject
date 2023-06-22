package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddItemInMultiple extends BaseClass {

    public void itemInMultipleTimes() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(1000);
        WebElement amountOfBooks = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[1]/div/div/div[4]/select"));
        Select select =new Select(amountOfBooks);
        select.selectByValue("7");
        System.out.println("Added Number of Books!!");
    }

}
