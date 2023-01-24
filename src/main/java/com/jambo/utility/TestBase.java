package com.jambo.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {

    protected WebDriver driver ;

    @BeforeEach
    public void setupWebDriver(){
//
        driver =  Driver.getDriver() ;

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @AfterEach
    public void closeBrowser(){

        Driver.closeBrowser();
    }


}
