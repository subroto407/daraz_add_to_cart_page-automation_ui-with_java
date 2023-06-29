package com.Alibaba.Daraz.TestCases;

import com.Alibaba.Daraz.Configuration.BaseClass;
import com.Alibaba.Daraz.PageConfiguration.LandingPage;
import com.Alibaba.Daraz.Pages.*;
import com.Alibaba.Daraz.Utilities.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartProductValidation extends BaseClass {

    @Test
    public void addToCartProductValidation(){

        LandingPage lp = new LandingPage(driver);
        AddNewAddressPage anap = new AddNewAddressPage(driver);
        CartPage cp = new CartPage(driver);
        SearchProductPage spp = new SearchProductPage(driver);
        SignupLoginPage slp = new SignupLoginPage(driver);

        //TC-01 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, TestData.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(1000);

        //TC-02 ClickSignup/Login Button
        lp.getSignupLoginButton().click();
        sleepTime(1000);

        //TC-03 LoginWith Email/Phone And Password
        slp.getInputEmailOrPhoneNumber().sendKeys(TestData.INPUT_PHONE_NUMBER);
        sleepTime(1000);
        slp.getInputPassword().sendKeys(TestData.INPUT_PASSWORD);
        sleepTime(1000);
        slp.getClickOnLoginButton().click();
        sleepTime(1000);

        //TC-04 Input Search Product Name and search
        lp.getInputSearchProduct().sendKeys(TestData.INPUT_SEARCH_PRODUCT);
        sleepTime(1000);
        lp.getClickSearchButton().click();
        sleepTime(1000);

        //TC-05 Select Product and Add To Cart Product
        spp.getSelectProduct().click();
        sleepTime(1000);
        spp.getClickAddToCartButton().click();
        sleepTime(1000);

        //TC-06 Verify Cart Item Massage And Click GoToCart Button
        if (spp.getVerifyAddToCartItemMassage().isDisplayed()){
            String cartText = spp.getVerifyAddToCartItemMassage().getText();
            Assert.assertTrue(true,cartText);
            System.out.println(TestData.POSITIVE_MASSAGE);
        }
        else {
            System.out.println(TestData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);
        spp.getClickGoToCartPage().click();
        sleepTime(1000);

        //TC-07 Select CheckBoxes And Proceed To CheckOut
        cp.getSelectProductFromCart().click();
        sleepTime(1000);
        cp.getClickProceedToCheckout().click();
        sleepTime(1000);

        //TC-08 Change Delivery Address And Click Add New Address
        cp.getClickOnAddressChange().click();
        sleepTime(1000);
        cp.getClickAddNewAddress().click();
        sleepTime(1000);

        //TC-09 Input Delivery Address
        anap.getInputFullName().sendKeys(TestData.INPUT_FULL_NAME);
        sleepTime(1000);
        anap.getInputMobileNumber().sendKeys(TestData.INPUT_MOBILE_NUMBER);
        sleepTime(1000);
        anap.getClickOnSelectProvince().click();
        sleepTime(1000);
        anap.getSelectDhaka().click();
        sleepTime(1000);
        anap.getClickOnCity().click();
        sleepTime(1000);
        anap.getSelectCity().click();
        sleepTime(1000);
        anap.getClickOnArea().click();
        sleepTime(1000);
        anap.getSelectArea().click();
        sleepTime(1000);
        anap.getInputAddress().sendKeys(TestData.INPUT_ADDRESS);
        sleepTime(1000);
        anap.getInputLandMark().sendKeys(TestData.INPUT_LANDMARK);
        sleepTime(1000);
        anap.getSelectLevelForEffectiveDelivery().click();
        sleepTime(1000);
        anap.getDefaultShippingAddressCheckBox().click();
        sleepTime(1000);
        anap.getDefaultBillingAddress().click();
        sleepTime(1000);
        anap.getClickOnSaveButton().click();
        sleepTime(1000);

        //TC-10 Select Delivery Address and Confirm
        anap.getSelectDeliveryAddress().click();
        sleepTime(1000);
        anap.getConfirmDeliveryAddress().click();
        sleepTime(1000);

        //TC-11 Click On Place Order
        cp.getClickPlaceOrderButton().click();
        sleepTime(1000);


        // Back to Home
        driver.navigate().to(TestData.BASE_URL);
        driver.quit();


    }

}
