package com.vytrack.stepdefinitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TruckDriverPage;
import com.vytrack.pages.VehiclesOdometerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleOdometerStepDefs {
 TruckDriverPage truckDriverPage = new TruckDriverPage();

 @And("user clicks on Vehicle Odometer")
 public void userClicksOnVehicleOdometer() {
     truckDriverPage.fleetModule.click();
  truckDriverPage.vehiclesOdometerLink.click();

 }




    @Then("User should see all vehicle odometer information on the grid")
    public void user_should_see_all_vehicle_odometer_information_on_the_grid() {
        VehiclesOdometerPage vehiclesOdometerPage = new VehiclesOdometerPage();

        List<WebElement> odometerInfo = new VehiclesOdometerPage().odometerGridInfo;
        Assert.assertFalse(odometerInfo.isEmpty());





    }



}
