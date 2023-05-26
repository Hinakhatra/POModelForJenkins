package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    //create object by access modifiers
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaDigitalCameraPage leicaDigitalCameraPage = new LeicaDigitalCameraPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    public void VerifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registrationPage.fillInRegistrationDetails_ForNewRegistration();
        //verify register success or not
        registrationResultPage.VerifyUserShouldBeAbleToRegisterSuccessfully();

    }
    @Test
    public void VerifyUserShouldBeAbleToSeeProductInShoppingCartSuccessfully(){
        //click on electronics
        homePage.clickOnElectronics();
        //click on camera and photo
        electronicsPage.clickOnCameraAndPhoto();
        //click on leica camera
        cameraAndPhotoPage.clickOnLeicaCamera();
        //get leica camera text
        leicaDigitalCameraPage.leicaCameraAddToCartAndShoppingCart();
        //compare product name matched or not in shopping cart
        shoppingCartPage.compareProductNameInCart();
    }

}
