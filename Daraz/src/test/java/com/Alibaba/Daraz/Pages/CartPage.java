package com.Alibaba.Daraz.Pages;

import com.Alibaba.Daraz.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#shop-title-wrap > div.checkout-shop > div > label > input[type=checkbox]")
    public WebElement selectProductFromCart;
    public WebElement getSelectProductFromCart(){
        return selectProductFromCart;
    }

    @FindBy(css = "#rightContainer_CR > div > div.summary-section-content > div > div.checkout-order-total > button")
    public WebElement clickProceedToCheckout;
    public WebElement getClickProceedToCheckout(){
        return clickProceedToCheckout;
    }

    @FindBy(css = "#addressV2_2_0 > div > div > span.action-edit")
    public WebElement clickOnAddressChange;
    public WebElement getClickOnAddressChange(){
        return clickOnAddressChange;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > div > div:nth-child(2) > div > div.mod-address-book-ft-left > span")
    public WebElement clickAddNewAddress;
    public WebElement getClickAddNewAddress(){
        return clickAddNewAddress;
    }

    @FindBy(css = "#orderTotalV2_23 > div.place-order-button-box > button")
    public WebElement clickPlaceOrderButton;
    public WebElement getClickPlaceOrderButton(){
        return clickPlaceOrderButton;
    }

}
