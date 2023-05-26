package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    private By _firstName = By.id("FirstName");
    private   By _lastName = By.id("LastName");
    private   By _email = By.name("Email");
    private   By _password = By.id("Password");
    private   By _confirmPassword = By.id("ConfirmPassword");
    private   By _registerButton = By.id("register-button");
    private By _dayOfBirthday = By.name("DateOfBirthDay");
    private By _monthOfBirthday = By.name("DateOfBirthMonth");
    private By _yearOfBirthday = By.name("DateOfBirthYear");
    LoadProp loadProp = new LoadProp();
    public void fillInRegistrationDetails_ForNewRegistration(){
        //type firstname
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type lastname
        typeText(_lastName,loadProp.getProperty("lastName"));
        //select dropdown Day
        selectElementByValue(_dayOfBirthday,loadProp.getProperty("date_Of_Birth"));
        //select dropdown Month
        selectElementByValue(_monthOfBirthday,loadProp.getProperty("month_Of_Birth"));
        //select dropdown year
        selectElementByText(_yearOfBirthday,loadProp.getProperty("year_Of_Birth"));
        //type email address
        typeText(_email,loadProp.getProperty("email")+timestamp()+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);

    }
    public void fillInRegistrationDetails_ForAlReadyRegisteredUser(){
        //type firstname
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type lastname
        typeText(_lastName,loadProp.getProperty("lastName"));
        //select dropdown Day
        selectElementByValue(_dayOfBirthday,loadProp.getProperty("date_Of_Birth"));
        //select dropdown Month
        selectElementByValue(_monthOfBirthday,loadProp.getProperty("month_Of_Birth"));
        //select dropdown year
        selectElementByText(_yearOfBirthday,loadProp.getProperty("year_Of_Birth"));
        //type email address
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);
    }
}
