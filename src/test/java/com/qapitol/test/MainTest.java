package com.qapitol.test;

import com.qapitol.project.base.BaseClass;
import com.qapitol.project.pages.*;
import com.qapitol.project.screenshots.Screenshot;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.awt.*;

public class MainTest extends BaseTest{

    Logger logger = Logger.getLogger(BaseClass.class);

    @org.testng.annotations.DataProvider(name="Registration_Details_Data_Provider")
    public Object[][] dataProviderForRegistration()
    {
        return new Object[][]
                {{"vk","VKumar","vinodkumarchandaka@gmail.com","Kumar@768","Kumar@768"}};
    }

    @org.testng.annotations.DataProvider(name = "Address_Page_Details")
            public Object[][] dataProviderForAddress(){
        return new Object[][]{{"6-2","apm","vskp","ap","530052","1234567890"}};
    }

//    @org.testng.annotations.DataProvider(name = "Login_Details")
//    public Object[][] dataProviderForLogin(){
//        return new Object[][]{{"vk","12345678"}};
//    }



    LaunchPage launchPage = new LaunchPage();
    LoginPage loginPage = new LoginPage();
    LogOut logOut = new LogOut();
    RegisterPage registerPage = new RegisterPage();
    AddAddressPage addressPage = new AddAddressPage();
    SelectAddress selectAddress = new SelectAddress();
    AddCardDetails addCardDetails = new AddCardDetails();
    PlaceAnOrder placeAnOrder = new PlaceAnOrder();
    UpdateProfilePage updateProfilePage = new UpdateProfilePage();
    CheckMyOrders checkMyOrders = new CheckMyOrders();
    AddMoreItemsToCart addMoreItemsToCart = new AddMoreItemsToCart();
    AddItemInMultiple addItemInMultiple = new AddItemInMultiple();
    DeleteItemsFromCart deleteItemsFromCart = new DeleteItemsFromCart();
    Screenshot screenshot = new Screenshot();

    @Test
    public void launchBrowser(){
        launchPage.homePage();
    }

    @Test(dataProvider = "Registration_Details_Data_Provider")
    @Description("Page Registration Details")
    @Story("Launching the Browser and sign up to the page")
    @Severity(SeverityLevel.BLOCKER)
    public void register(String username,String firstName,String mailId,String password,String conformPassword) throws InterruptedException {
        launchPage.homePage();
        registerPage.pageRegister(username,firstName,mailId,password,conformPassword);
    }

    @Test(priority = 0)
    @Description("Launching Browser")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Launching Browser and Login into page")
    public void Login() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
    }

    @Test(priority = 1)
    @Description("Page sign in and Logout")
    @Story("logging into the page and LogOut")
    @Severity(SeverityLevel.BLOCKER)
    public void logOutPage() throws InterruptedException {launchPage.homePage();
        loginPage.pageSignIn();
        Thread.sleep(2000);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
        System.out.println("Logged Out Successfully");

    }

    @Test(priority = 2, dataProvider = "Address_Page_Details")
    @Description("Add an address")
    @Severity(SeverityLevel.CRITICAL)
    @Story("logging into the page and Adding address for placing an order and LogOut")
    public void addressPageDetails(String doorNo,String village,String city,String state,String pinCode,String mobileNo) throws InterruptedException, AWTException {
        launchPage.homePage();
        loginPage.pageSignIn();
        placeAnOrder.orderCheckOut();
        addressPage.details(doorNo,village,city,state,pinCode,mobileNo);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
        System.out.println("Logged Out Successfully");
    }

    @Test(priority = 3)
    @Description("Update Profile")
    @Story("logging into the page and Updating the Profile and LogOut")
    @Severity(SeverityLevel.CRITICAL)
    public void updateProfile() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        updateProfilePage.profile();
        String actualResult = driver.getTitle();
        String expectedResult = "React App";
        Assert.assertEquals(actualResult,expectedResult,"Profile Updated Successfully");
        Thread.sleep(5000);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
        System.out.println("Logged Out Successfully");
    }
    @Test(priority = 4)
    @Description("Placing an Order")
    @Severity(SeverityLevel.CRITICAL)
    @Story("logging into the, Adding items to the cart and placing an Order and LogOut")
    public void checkForPlaceAnOrder() throws InterruptedException, AWTException {
        launchPage.homePage();
        loginPage.pageSignIn();
        placeAnOrder.orderCheckOut();
        placeAnOrder.select();
        placeAnOrder.proceedForPayment();
        placeAnOrder.selectPaymentMethod();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://139.59.27.246:3000/placeorder";
        Assert.assertEquals(actualUrl,expectedUrl,"Place Order Page Opened");
        placeAnOrder.placeOrder();
        Thread.sleep(2000);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
    }

    @Test(priority = 5)
    @Description("Checking Orders")
    @Story("logging into the page and Checking the order details and LogOut")
    @Severity(SeverityLevel.CRITICAL)
    public void checkOrderDetails() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        checkMyOrders.orderDetails();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "http://139.59.27.246:3000/order/0af46d36-1407-4348-82a9-0fb9b5dafe45";
        Assert.assertEquals(actualResult,expectedResult,"Order Details Opened");
        Thread.sleep(1000);
        screenshot.takeScreenshot();

        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
    }

    @Test(priority = 6)
    @Description("Adding items to cart")
    @Severity(SeverityLevel.NORMAL)
    @Story("logging into the page and Adding items to the cart and LogOut")
    public void addItemsToCart() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        addMoreItemsToCart.addItems();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "http://139.59.27.246:3000/cart/12?qty=1";
        Assert.assertEquals(actualResult,expectedResult,"Items Added to the Cart");
        Thread.sleep(1000);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");

    }

    @Test(priority = 7)
    @Description("Adding Item in Bulk")
    @Story("logging into the page and Adding number of books in single item to the cart and LogOut")
    @Severity(SeverityLevel.NORMAL)
    public void AddingItemInBulk() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        addItemInMultiple.itemInMultipleTimes();
        Thread.sleep(1000);
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
    }

    @Test(priority = 8)
    @Description("Deleting Items From Cart")
    @Severity(SeverityLevel.NORMAL)
    @Story("Logging into the page deleting items from cart and logout")
    public void deleteItemsInCart() throws InterruptedException {
        launchPage.homePage();
        loginPage.pageSignIn();
        addMoreItemsToCart.addItems();
        deleteItemsFromCart.deleteItems();
        Thread.sleep(1000);
        screenshot.takeScreenshot();
        logOut.pageLogOut();
        String  actualValue= driver.getCurrentUrl();
        Assert.assertEquals(actualValue,"http://139.59.27.246:3000/login");
    }


}
