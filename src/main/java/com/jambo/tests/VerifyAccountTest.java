package com.jambo.tests;

import com.jambo.pages.JamboVerifyAccount;
import com.jambo.utility.TestBase;
import org.junit.jupiter.api.Test;

public class VerifyAccountTest extends TestBase {

    JamboVerifyAccount jamboVerifyAccount;

    @Test
    public void testVerifyAccount(){
        jamboVerifyAccount = new JamboVerifyAccount();
        jamboVerifyAccount.goTo();
        jamboVerifyAccount.getCsrfToken();
    }


}
