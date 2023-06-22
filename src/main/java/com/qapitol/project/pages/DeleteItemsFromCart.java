package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;

public class DeleteItemsFromCart extends BaseClass {

    public void deleteItems() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[1]/div[2]/div/div[6]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[1]/div[1]/div/div[6]/button")).click();
        Thread.sleep(1000);

    }
}
