package com.qapitol.project.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.logging.FileHandler;

public class PropertyReader {

    String AddressUrl = "src\\test\\java\\resources\\address.properties";

    FileReader fileReader = null;
    public static Properties properties = null;

    public void init()  {
           properties = new Properties();
           try {
               fileReader = new FileReader(AddressUrl);
               properties.load(fileReader);
           }catch (Exception e){
               e.printStackTrace();
           }

    }


}
