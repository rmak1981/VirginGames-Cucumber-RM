package com.virgingames.cucumber;

/*
 * Ravi's Creation
 * Date of Creation 31/05/2020
 */

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        //feature file path
        features =  ".",
        //this will creates json report/cucumber default report/creates extent report
        plugin =  {"json:target/RunCuke/cucumber.json","pretty","html:target/" +
                "cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        monochrome = true
)
public class CukeTest {

    @AfterClass

    public static void setUp(){

        String projectPath = System.getProperty("user.dir");
        //generates Extent report
        String reportConfigPath = projectPath+ "/src/test/java/com/virgingames/resourses/extentreports/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
}
