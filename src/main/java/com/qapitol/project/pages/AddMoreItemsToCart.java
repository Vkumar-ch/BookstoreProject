package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;

public class AddMoreItemsToCart extends BaseClass {

    public void addItems() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[4]/div/a/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(1000);
    }
}
