package com.jambo.tests;

import com.jambo.pages.JamboLogin;
import com.jambo.utility.BrowserUtil;
import com.jambo.utility.Driver;
import com.jambo.utility.TestBase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JamboLoginTest extends TestBase {

    JamboLogin jamboLogin;

    @Test
    public void testLogin(){

        jamboLogin = new JamboLogin();
        jamboLogin.goTo();
        BrowserUtil.waitFor(2);
        jamboLogin.userNameField.sendKeys("0115882300");
        jamboLogin.passwordField.sendKeys("123456");
        BrowserUtil.waitFor(2);
        jamboLogin.loginBtn.click();
        BrowserUtil.waitFor(1);




    }

    @Test
    public void testLoginPageLoadCorrectly(){

        jamboLogin = new JamboLogin();
        jamboLogin.goTo();

//        String actualLoginUrl = driver.getCurrentUrl();
//        System.out.println(actualLoginUrl);

        String actualUsernameId = jamboLogin.userNameField.getAttribute("id");
        String actualPasswordId = jamboLogin.passwordField.getAttribute("id");


        //assertEquals("https://accounts.jambopay.com/v2/account/login",actualLoginUrl);

        assertEquals("phone_number", jamboLogin.userNameField.getAttribute("id"));
        assertEquals("password",jamboLogin.passwordField.getAttribute("id"));
    }
}
