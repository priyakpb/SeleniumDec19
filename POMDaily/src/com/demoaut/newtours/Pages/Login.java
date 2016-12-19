package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	private WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement password;
	
		
	@FindBy(name="login")
	@CacheLookup
	private WebElement submit;
	
	//initelement will initialize the webelement and store it in cachelookup memory,hence the process become faster
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String userName, String Password){
		username.sendKeys(userName);
		password.sendKeys(Password);
		submit.click();
		
	}
	
	
	
	
	
	
	

}
