package com.jambo.pages;

import com.jambo.utility.ConfigReader;
import com.jambo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JamboLogin {

    @FindBy( id= "phone_number")
    public WebElement userNameField ;

    @FindBy(id = "password")
    public WebElement passwordField ;



    @FindBy(xpath = "//h6[.='Welcome back']")
    public WebElement loginHeader;

    @FindBy(xpath = "//span[.='LOGIN']")
    public WebElement loginBtn;


    public JamboLogin(){

        PageFactory.initElements(Driver.getDriver() , this );

    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("login_url")    );
    }

    public void loginCredentialsDisplayed(){

        this.loginHeader.isDisplayed();
        this.loginBtn.isDisplayed();

    }




}
