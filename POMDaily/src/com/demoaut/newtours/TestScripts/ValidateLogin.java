package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;

public class ValidateLogin extends BaseClass {

//	WebDriver driver;
	
	/*@BeforeTest
	
	public void openbrowser(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
			
					
	}*/
	
	@Test
	
	public void validatelogin(){
		
		try{
		Login l = new Login(driver);
		
		l.Login("mercury", "mercury");
		
		String expectedmsg ="Find a Flight: Mercury Tours:";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedmsg);
		}
		
		catch(AssertionError e){
			
			Assert.fail();
		}
			
		
	}
	
	/*@AfterTest
	
	public void closebrowser(){
		
		driver.close();
	}*/
	
}
