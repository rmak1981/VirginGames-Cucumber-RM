package com.virgingames.pages;

import com.virgingames.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */

public class HomePage extends UtilityRM {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _loginLink;


    public void clickOnLogin() {
        clickOnElement(_loginLink);
    }

}
