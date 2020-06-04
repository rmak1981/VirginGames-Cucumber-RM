package com.virgingames.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */
public class BasePage {

    // web driver

    public static WebDriver driver;

    // creating constructor to initiate log

    public BasePage(){

        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/" +
                "virgingames/resourses/properties/log4j.properties");
        PageFactory.initElements(driver,this);


    }

}
