package com.jambo.pages;

import com.jambo.utility.ConfigReader;
import com.jambo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JamboRegistration {

    @FindBy(id = "phone_number")
    public WebElement phone_numberBox;

    @FindBy(id = "first_name")
    public WebElement first_nameBox;

    @FindBy(id = "last_name")
    public WebElement last_nameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "confirm_password")
    public WebElement confirm_passwordBox;

    @FindBy(id = "terms")
    public WebElement terms;

    @FindBy(css = "//button[@type='submit']")
    public WebElement signUpButton ;

    public JamboRegistration(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("signUp_url")    );
    }

    public void register(){
        this.phone_numberBox.sendKeys("0715023823");//enter new number that does not exist in the system
        this.first_nameBox.sendKeys("Collins");
        this.last_nameBox.sendKeys("Kipkoech");
        this.emailBox.sendKeys("collinskipkoech95@gmail.com");
        this.passwordBox.sendKeys("123456");
        this.confirm_passwordBox.sendKeys("123456");
        this.terms.click();
        this.signUpButton.click();

    }


}
