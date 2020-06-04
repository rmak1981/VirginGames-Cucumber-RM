package com.virgingames.utility;

import com.virgingames.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;



public class UtilityRM extends BasePage {

    //public WebDriver driver;

    private JavascriptExecutor jse;

    // this method will click on element

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This method will click on element

    public void clickOnElement(WebElement element) {
        element.click();
    }

    // this method will send text on element
    public void sendTextToElement(By by, String str) {
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }






     // This method will verify Text using Assert.assertEquals function

    public void verifyTextAssertMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }


     // This method will verify Text using Assert.assertEquals function

    public void verifyTextAssertMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }





    /**
     * This method will take the screenshot and add to screenshot folder
     * This method will required parameter like screenshot name and return destination path
     *
     * @param driver
     * @param screenshotName
     * @return
     */
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/virgingames/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /**
     * This method will take the screenshot and add to test-output/html folder
     * This method will required parameter like screenshot name and return the destination path
     *
     * @param fileName
     * @return
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /**
     * This method will return current time stamp
     *
     * @return
     */

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }


}




