package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookFlight;
import com.demoaut.newtours.Pages.Flightfinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;



public class TicketBooking extends BaseClass {
	
	
	//WebDriver driver;
	/*@BeforeTest
	
	public void openbrowser(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
		
		
	}*/
	
	@Test
	
	public void bookaflight(){
		
		try{
		Login l = new Login(driver);
		Flightfinder ff = new Flightfinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookFlight bf = new BookFlight(driver);
		
			
			l.Login("mercury", "mercury");
			ff.selectairline();
			sf.selectflight();
			bf.bookaflight("Priya", "b", "1234");
			
		String expectedTitle ="Your itinerary has been booked!";
		String actualtitle = driver.findElement(By.xpath("html/body/div[1]/table"
				+ "/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]"
				+ "/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		
		Assert.assertEquals(expectedTitle, actualtitle);
		}
		
		catch(AssertionError e){
			
			System.out.println("Now the control is in catch block");
			Assert.fail();
		}
		
	}
	
	/*@AfterTest
	
	public void close(){
		
		driver.close();
	}*/
	

}
