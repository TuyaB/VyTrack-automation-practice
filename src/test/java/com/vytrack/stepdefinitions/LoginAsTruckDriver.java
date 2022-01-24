package com.vytrack.stepdefinitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TruckDriverPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginAsTruckDriver {
    LoginPage loginPage = new LoginPage();

    @When("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String u, String p) {
        loginPage.login(u, p);


    }
    @And("User clicks on Remember me check box")
    public void userClicksOnRememberMeCheckBox() {

    }

    @When("the Fleet Management page for Truck Driver should be displayed")
    public void the_fleet_management_page_for_truck_driver_should_be_displayed() {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Dashboard", currentTitle);

    }
    @Then("Fleet Management page should have following module types:")
    public void fleet_management_page_should_have_following_module_types(List<String> expectedModules) {

//        List<WebElement> modulesElements = BrowserUtils.getElementsText(new TruckDriverPage().modules);
//
//        List<String> actualModules = BrowserUtils.getElementsText(modulesElements);
//        System.out.println("actualModules" + actualModules);
//


    }



}
