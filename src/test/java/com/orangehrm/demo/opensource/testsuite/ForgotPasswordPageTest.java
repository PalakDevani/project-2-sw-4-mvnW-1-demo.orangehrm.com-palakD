package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotpassword = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotpassword.clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']/p"));
        Assert.assertEquals(forgotpassword.getResetPasswordText(), "Reset Password", "Reset Password Text not available");

    }
}
