package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _cameraAndPhoto = By.xpath("//a[@title='Show products in category Camera & photo']");

    public void clickOnCameraAndPhoto(){
        //click on camera & photo
        clickOnElement(_cameraAndPhoto);

    }
}

