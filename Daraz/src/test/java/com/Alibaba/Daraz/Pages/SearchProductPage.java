package com.Alibaba.Daraz.Pages;

import com.Alibaba.Daraz.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends BasePage {
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#root > div > div.ant-row.main--pIV2h > div > div > div.ant-col-20.ant-col-push-4.side-right--Tyehf > div.box--ujueT > div:nth-child(2) > div > div")
    public WebElement selectProduct;
    public WebElement getSelectProduct(){
        return selectProduct;
    }

    @FindBy(css = "#module_add_to_cart > div > button.add-to-cart-buy-now-btn.pdp-button.pdp-button_type_text.pdp-button_theme_orange.pdp-button_size_xl > span > span")
    public WebElement clickAddToCartButton;
    public WebElement getClickAddToCartButton(){
        return clickAddToCartButton;
    }

    @FindBy(css = "#dialog-body-1 > div > div.cart-modal-content > div > div.cart-panel.cart-panel-left > div.cart-message")
    public WebElement verifyAddToCartItemMassage;
    public WebElement getVerifyAddToCartItemMassage(){
        return verifyAddToCartItemMassage;
    }

    @FindBy(css = "#dialog-body-1 > div > div.cart-modal-content > div > div.cart-panel.cart-panel-right > div > div > div > div.cart-order-total.checkout-order-total > button")
    public WebElement clickGoToCartPage;
    public WebElement getClickGoToCartPage(){
        return clickGoToCartPage;
    }
}
