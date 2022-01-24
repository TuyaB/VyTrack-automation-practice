package com.vytrack.stepdefinitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.Locale;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Given("Page Title should as expected")
    public void page_title_should_as_expected() {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Login", currentTitle);

    }


}
