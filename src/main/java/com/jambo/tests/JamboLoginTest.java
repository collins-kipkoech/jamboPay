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




    }

    @Test
    public void testLoginPageLoadCorrectly(){

        String actualLoginUrl = driver.getCurrentUrl();

        String actualUsernameId= jamboLogin.userNameField.getAttribute("id");
        String actualPasswordId = jamboLogin.passwordField.getAttribute("id");


        assertEquals("https://accounts.jambopay.com/v2/account/login",actualLoginUrl);

        assertEquals("phone_number", actualUsernameId);
        assertEquals("password",actualPasswordId);
    }
}
