package com.jambo.tests;

import com.jambo.pages.JamboRegistration;
import com.jambo.utility.TestBase;
import org.junit.jupiter.api.Test;

public class JamboRegistrationTest extends TestBase {

    JamboRegistration jamboRegistration;

    @Test
    public void testRegistration(){
        jamboRegistration = new JamboRegistration();
        jamboRegistration.goTo();
        jamboRegistration.register();
    }
}
