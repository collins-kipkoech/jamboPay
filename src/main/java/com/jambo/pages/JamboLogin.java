package com.jambo.pages;

import com.jambo.utility.ConfigReader;
import com.jambo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JamboLogin {

    @FindBy(xpath = "//input[@id='phone_number']")
    public WebElement userNameField ;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordField ;

    @FindBy(css = "//button[@type='submit']")
    public WebElement loginButton ;

    @FindBy(xpath = "//h6[.='Welcome back']")
    public WebElement loginHeader;

    @FindBy(xpath = "//span[.='LOGIN']")
    public WebElement login;


    public JamboLogin(){

        PageFactory.initElements(Driver.getDriver() , this );

    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("login_url")    );
    }

    public void loginCredentialsDisplayed(){

        this.loginHeader.isDisplayed();
        this.login.isDisplayed();

    }




}
