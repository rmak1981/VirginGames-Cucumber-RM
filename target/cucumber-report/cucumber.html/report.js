$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/virgingames/resourses/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "\r\nAs a user I want to log in to virgin games account",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29696194200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User is on Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 1430442700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should navigate to virgin games login page successfully",
  "description": "",
  "id": "login-feature;user-should-navigate-to-virgin-games-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on Log in link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter username \"luckyrbm\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password \"xyz123\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Log in Button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I should not able to log in and get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogInLink()"
});
formatter.result({
  "duration": 2706418500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 20747481600,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //a[contains(text(),\u0027Forgotten Details?\u0027)]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENSESUK\u0027, ip: \u0027192.168.0.15\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 75.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200403170909, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 9292, moz:profile: C:\\Users\\LENSES UK\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0e4fbbc9-1ca7-4377-a250-af26a19fc3dc\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Forgotten Details?\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat com.virgingames.utility.UtilityRM.verifyTextAssertMethod(UtilityRM.java:62)\r\n\tat com.virgingames.pages.LoginPage.verifyForgottenDetailsText(LoginPage.java:37)\r\n\tat com.virgingames.cucumber.stepdefs.MyStepdefs.iShouldNavigateToLoginPageSuccessfully(MyStepdefs.java:31)\r\n\tat ✽.Then I should navigate to login page successfully(src/test/java/com/virgingames/resourses/featurefile/login.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "luckyrbm",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iShouldNotAbleToLogInAndGetErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 204235900,
  "status": "passed"
});
});