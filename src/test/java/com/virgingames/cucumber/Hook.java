package com.virgingames.cucumber;

import com.cucumber.listener.Reporter;
import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import com.virgingames.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */

public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    // Browser1 is chrome
    String browser1 = loadProperty.getProperty("browser1");
    // Browser2 is firefox
    String browser2 = loadProperty.getProperty("browser2");
    // Browser3 is ie
    String browser3 = loadProperty.getProperty("browser3");
    private String screenShotPath;

    @Before
    public void openBrowser(){
        //browserSelector.selectBrowser(browser1);
        browserSelector.selectBrowser(browser2);
        //browserSelector.selectBrowser(browser3);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        Reporter.assignAuthor("Prime3","RM");
    }
    @After

    public void closeBrowse(Scenario scenario){

        if (scenario.isFailed()){
            String screenShotPath = UtilityRM.getScreenshot(driver,scenario.getName().replace(" ","_"));
        }

        try {
            Reporter.addScreenCaptureFromPath(screenShotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
       // driver.quit();
    }
}