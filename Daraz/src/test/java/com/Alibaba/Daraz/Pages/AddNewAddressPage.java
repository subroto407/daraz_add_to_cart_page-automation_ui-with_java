package com.Alibaba.Daraz.Pages;

import com.Alibaba.Daraz.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage extends BasePage {
    public AddNewAddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-left > div.mod-input.mod-input-name > input[type=text]")
    public WebElement inputFullName;
    public WebElement getInputFullName(){
        return inputFullName;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-left > div.mod-input.mod-input-phone > input[type=number]")
    public WebElement inputMobileNumber;
    public WebElement getInputMobileNumber(){
        return inputMobileNumber;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-left > div.mod-select.mod-address-form-select.mod-select-location-tree-1 > span > span")
    public WebElement clickOnSelectProvince;
    public WebElement getClickOnSelectProvince(){
        return clickOnSelectProvince;
    }

    @FindBy(css = "#R3921322")
    public WebElement selectDhaka;
    public WebElement getSelectDhaka(){
        return selectDhaka;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-left > div.mod-select.mod-address-form-select.mod-select-location-tree-2 > span > span")
    public WebElement clickOnCity;
    public WebElement getClickOnCity(){
        return clickOnCity;
    }

    @FindBy(xpath = "//li[@id='R80300576']")
    public WebElement selectCity;
    public WebElement getSelectCity(){
        return selectCity;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-left > div.mod-select.mod-address-form-select.mod-select-location-tree-3 > span > span")
    public WebElement clickOnArea;
    public WebElement getClickOnArea(){
        return clickOnArea;
    }

    @FindBy(css = "#R80301334")
    public WebElement selectArea;
    public WebElement getSelectArea(){
        return selectArea;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-right > div.mod-input.mod-input-detailAddress > input[type=text]")
    public WebElement inputAddress;
    public WebElement getInputAddress(){
        return inputAddress;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-right > div.mod-input.mod-input-extendAddress > input[type=text]")
    public WebElement inputLandMark;
    public WebElement getInputLandMark(){
        return inputLandMark;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-bd > div.mod-address-form-right > div.mod-address-tag > div > div.mod-address-tag-item.mod-address-tag-home")
    public WebElement selectLevelForEffectiveDelivery;
    public WebElement getSelectLevelForEffectiveDelivery(){
        return selectLevelForEffectiveDelivery;
    }

    @FindBy(css = "#isDefaultShipping")
    public WebElement defaultShippingAddressCheckBox;
    public WebElement getDefaultShippingAddressCheckBox(){
        return defaultShippingAddressCheckBox;
    }

    @FindBy(css = "#isDefaultBilling")
    public WebElement defaultBillingAddress;
    public WebElement getDefaultBillingAddress(){
        return defaultBillingAddress;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > form > div > div.mod-address-form-action > button")
    public WebElement clickOnSaveButton;
    public WebElement getClickOnSaveButton(){
        return clickOnSaveButton;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > div > div.mod-address-book-content > div > div.mod-address-book-card.mod-address-book-card-active")
    public WebElement selectDeliveryAddress;
    public WebElement getSelectDeliveryAddress(){
        return selectDeliveryAddress;
    }

    @FindBy(css = "#dialog-body-1 > div.mod-address-dialog-content > div > div > div:nth-child(2) > div > div.mod-address-book-ft-right > button")
    public WebElement confirmDeliveryAddress;
    public WebElement getConfirmDeliveryAddress(){
        return confirmDeliveryAddress;
    }

}
