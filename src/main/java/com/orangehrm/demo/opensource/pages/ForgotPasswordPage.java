package com.orangehrm.demo.opensource.pages;

import com.orangehrm.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By forgotYourPasswordLink = By.xpath("//div[@class='orangehrm-login-forgot']/p");
    By resetPasswordText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    public void clickOnForgotYourPasswordLink() {
        clickOnElement(forgotYourPasswordLink);
    }

    public String getResetPasswordText() {
        return getTextFromElement(resetPasswordText);
    }
}
