package org.example;

import org.openqa.selenium.By;

public class LeicaDigitalCameraPage extends Utils{
    private By _productName = By.xpath("//div[@class=\"product-name\"]/h1");
    private By _AddToCart = By.xpath("//div[@class=\"add-to-cart\"]/div/button");
    private By _shoppingCart = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/cart\"]");

    public void leicaCameraAddToCartAndShoppingCart() {
        //Get product name
        String productName = getTextFromElement(_productName);
        //print product name
        System.out.println("Print Product Name: "+productName);
        //click on Add to cart button
        clickOnElement(_AddToCart);
        //click on shopping cart on green line
        clickOnElement(_shoppingCart);

    }

}
