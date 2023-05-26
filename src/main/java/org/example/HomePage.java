package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerButton = By.className("ico-register");
    private By _electronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a");

    LoadProp loadProp = new LoadProp();
    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnElectronics(){
        //click on electronics
        clickOnElement(_electronics);
    }
}
