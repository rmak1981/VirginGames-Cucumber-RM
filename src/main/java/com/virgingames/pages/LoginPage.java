package com.virgingames.pages;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */

import com.cucumber.listener.Reporter;
import com.virgingames.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='field-username']")
    WebElement _userNameFiled;

    @FindBy(name = "password")
    WebElement _passwordFiled;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement _loginBtnClick;

    @FindBy(xpath = "//a[contains(text(),'Forgotten Details?')]")
    WebElement _forgottenDetails;

    @FindBy(xpath = "//div[@class='output']")
    WebElement _pleaseTryAgainErrMsg;

    // this method is verifying user is on log in page by using forgotten details text
    public void verifyForgottenDetailsText(String forgottenDetails) {
        Reporter.addStepLog("Verify Text:" + forgottenDetails + "Forgotten Details " + _forgottenDetails.toString() + "<br>");
        verifyTextAssertMethod(_forgottenDetails, forgottenDetails);
        log.info("verify Welcome Text" + forgottenDetails + "displayed msg " + _forgottenDetails.toString());
    }

    public void enterUsernameToField(String userName) {
        Reporter.addStepLog("Enter Usernam:" + userName + "To the Filed" + _userNameFiled.toString() + "<br>");
        sendTextToElement(_userNameFiled, userName);
        log.info("Enter Usernam:" + userName + "To the Filed" + _userNameFiled.toString());
    }

    public void enterPasswordToField(String passWord) {
        Reporter.addStepLog("Enter Password: " + passWord + "To the Field" + _passwordFiled.toString() + "<br>");
        sendTextToElement(_passwordFiled, passWord);
        log.info("Enter Password: " + passWord + "To the Field" + _passwordFiled.toString());
    }

    public void clickOnLogInBtn() {
        Reporter.addStepLog("Click on Login Btn:" + _loginBtnClick.toString());
        clickOnElement(_loginBtnClick);
        log.info("Click on Login Btn:" + _loginBtnClick.toString());
    }

    // this method will verify error msg
    public void verifyErrorText(String ErrorMsg) {
        Reporter.addStepLog("Verify Text:" + ErrorMsg + "Please try again error msg " + _pleaseTryAgainErrMsg.toString() + "<br>");
        verifyTextAssertMethod(_pleaseTryAgainErrMsg, ErrorMsg);
        log.info("verify Welcome Text" + ErrorMsg + "displayed msg " + _pleaseTryAgainErrMsg.toString());
    }

}
