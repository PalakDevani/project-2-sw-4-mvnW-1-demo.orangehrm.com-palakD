package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.LoginPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginpage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredential() {
        loginpage.enterUsername("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(loginpage.getDisplayText(), "Dashboard", "Dashboard text is not visible");

    }
}
