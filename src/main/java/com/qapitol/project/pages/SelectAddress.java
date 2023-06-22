package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectAddress extends BaseClass {

    public void select(){
        WebElement addressElement = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[1]/div[2]/div/div/div[1]/div/input"));
        boolean sel = addressElement.isDisplayed();
        if(sel == true){
            addressElement.click();
        }
    }
}
