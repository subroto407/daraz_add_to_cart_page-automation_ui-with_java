package com.Alibaba.Daraz.PageConfiguration;

import com.Alibaba.Daraz.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#anonLogin > a")
    public WebElement signupLoginButton;
    public WebElement getSignupLoginButton() {
        return signupLoginButton;
    }

    @FindBy(xpath = "//input[@id='q']")
    public WebElement inputSearchProduct;
    public WebElement getInputSearchProduct(){
        return inputSearchProduct;
    }

    @FindBy(css = "#topActionHeader > div.lzd-header-content > div.lzd-logo-bar > div > div.lzd-nav-search > form > div > div.search-box__search--2fC5 > button")
    public WebElement clickSearchButton;
    public WebElement getClickSearchButton(){
        return clickSearchButton;
    }


}
