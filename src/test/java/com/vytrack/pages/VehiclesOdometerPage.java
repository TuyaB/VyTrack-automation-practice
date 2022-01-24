package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesOdometerPage extends BasePage{
    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> odometerGridInfo;




}
