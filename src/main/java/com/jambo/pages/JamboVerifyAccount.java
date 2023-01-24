package com.jambo.pages;

import com.jambo.utility.BrowserUtil;
import com.jambo.utility.ConfigReader;
import com.jambo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JamboVerifyAccount {

    @FindBy(id = "phone_number")
    public WebElement phone_number;

    @FindBy(id = "request")
    public WebElement requestBtn;


    public JamboVerifyAccount(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("verify_url")    );
    }

    public void getCsrfToken(){
        this.phone_number.sendKeys("0708901215");
        BrowserUtil.waitFor(2);
        requestBtn.click();
    }
}
