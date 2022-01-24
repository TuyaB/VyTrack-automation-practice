package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{


    @FindBy(name = "_username")
    public WebElement usernameInput;

    @FindBy(name = "_password")
    public WebElement passwordInput;

    @FindBy(name = "_submit")
    public WebElement submitButton;

    public void login(String u,String p){
        usernameInput.sendKeys(u);
        passwordInput.sendKeys(p);
        submitButton.click();
    }

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;


    @FindBy(xpath = "//input[@id='remember_me']")
    public WebElement rememberMe;

}

