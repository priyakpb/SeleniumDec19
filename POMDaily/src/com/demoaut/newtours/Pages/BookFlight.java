package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {

	private WebDriver driver;

	@FindBy(name = "passFirst0")
	@CacheLookup
	private WebElement FirstName;

	@FindBy(name = "passLast0")
	@CacheLookup
	private WebElement LastName;

	@FindBy(name = "creditnumber")
	@CacheLookup
	private WebElement CNumber;

	@FindBy(name = "buyFlights")
	@CacheLookup
	private WebElement purchase;

	public BookFlight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void bookaflight(String Fname, String Lname, String ccnumber) {

		FirstName.sendKeys(Fname);
		LastName.sendKeys(Lname);
		CNumber.sendKeys(ccnumber);
		purchase.click();

	}

}
