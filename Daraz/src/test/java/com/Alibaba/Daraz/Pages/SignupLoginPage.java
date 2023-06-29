package com.Alibaba.Daraz.Pages;

import com.Alibaba.Daraz.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends BasePage {
    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Please enter your Phone Number or Email']")
    public WebElement inputEmailOrPhoneNumber;
    public WebElement getInputEmailOrPhoneNumber(){
        return inputEmailOrPhoneNumber;
    }


    @FindBy(xpath = "//input[@placeholder='Please enter your password']")
    public WebElement inputPassword;
    public WebElement getInputPassword(){
        return inputPassword;
    }


    @FindBy(css = "#container > div > div:nth-child(2) > form > div > div.mod-login-col2 > div.mod-login-btn > button")
    public WebElement clickOnLoginButton;
    public WebElement getClickOnLoginButton(){
        return clickOnLoginButton;
    }
}
