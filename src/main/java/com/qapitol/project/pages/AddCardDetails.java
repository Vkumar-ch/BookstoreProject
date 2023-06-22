package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;

public class AddCardDetails extends BaseClass {

    public void AddCard() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[2]/div[2]/button")).click();
        Thread.sleep(1000);
    }
}
