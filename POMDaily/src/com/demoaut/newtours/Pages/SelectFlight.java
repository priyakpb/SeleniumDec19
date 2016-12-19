package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	private WebDriver driver;

	@FindBy(css = "input[value='Blue Skies Airlines$361$271$7:10']")
	@CacheLookup
	private WebElement depart;

	@FindBy(css = "input[value='Unified Airlines$633$303$18:44']")
	@CacheLookup
	private WebElement arrival;

	@FindBy(name = "reserveFlights")
	@CacheLookup
	private WebElement submit;

	public SelectFlight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectflight() {
		depart.click();
		arrival.click();
		submit.click();

	}

}
