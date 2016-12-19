package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flightfinder {

	private WebDriver driver;

	@FindBy(css = "input[value='Business']")
	@CacheLookup
	private WebElement serviceclass;

	@FindBy(name = "airline")
	@CacheLookup
	private WebElement airline;

	@FindBy(name = "findFlights")
	@CacheLookup
	private WebElement submit;

	public Flightfinder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectairline() {
		
		serviceclass.click();
		Select flight = new Select(airline);
		flight.selectByVisibleText("Blue Skies Airlines");
		submit.click();

	}

}
