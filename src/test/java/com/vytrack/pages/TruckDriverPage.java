package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TruckDriverPage extends BasePage{


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement modules;

    //linkText("Fleet")
    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetModule;

    @FindBy(linkText = "Vehicles")
    public WebElement vehiclesLink;

    @FindBy(linkText = "Vehicle Odometer")
    public WebElement vehiclesOdometerLink;



}
