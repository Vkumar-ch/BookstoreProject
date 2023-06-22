package com.qapitol.test;

import com.qapitol.project.base.BaseClass;
import com.qapitol.project.utility.PropertyReader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

public class BaseTest extends BaseClass {
    BaseClass baseClass = new BaseClass();
    PropertyReader propertyReader = new PropertyReader();
    Logger logger = Logger.getLogger(BaseClass.class);

    @BeforeSuite
    public void startBrowser(){
        logger.info("Launching Browser");
        propertyReader.init();
        baseClass.setUp();
    }

//    @AfterSuite
//    public void closeBrowser(){
//        baseClass.tearDown();
//    }

}
