package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _productName1 = By.className("product-name");
    LoadProp loadProp = new LoadProp();
    public void compareProductNameInCart() {
        //Get same product name in shopping cart
        String productName1 = getTextFromElement(By.className("product-name"));
        //print same product name
        System.out.println("Print product name: " + productName1);
        Assert.assertEquals(productName1,loadProp.getProperty("expectedConfirmProductMessage"));

    }


}
