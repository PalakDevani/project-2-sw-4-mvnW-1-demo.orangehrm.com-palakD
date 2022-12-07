package com.orangehrm.demo.opensource.pages;

import com.orangehrm.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By displayText = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getDisplayText() {
        return getTextFromElement(displayText);
    }

}
