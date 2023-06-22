package com.qapitol.project.pages;

import com.qapitol.project.base.BaseClass;
import com.qapitol.project.utility.PropertyReader;

public class LaunchPage extends BaseClass {

    public void homePage(){
        String hostPage = PropertyReader.properties.getProperty("url");
        driver.get(hostPage);
    }

}
