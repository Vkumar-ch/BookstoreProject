package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class PlaceAnOrder extends BaseClass {

    public void orderCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Proceed To Checkout')]")).click();
    }

    public void select(){
        WebElement addressElement = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[1]/div[2]/div/div/div[1]/div/input"));
        boolean sel = addressElement.isDisplayed();
        if(sel == true){
            addressElement.click();
        }
    }

    public void proceedForPayment() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mouseWheel(5);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
    }
    public void selectPaymentMethod() throws InterruptedException {
        WebElement paymentElement = driver.findElement(By.id("pm_1NKyKUG9R9y827nty1yapR98"));
        boolean sel = paymentElement.isDisplayed();
        if(sel == true){
            paymentElement.click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to PlaceOrder')]")).click();
    }
    public void placeOrder() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        Thread.sleep(2000);
    }
}
