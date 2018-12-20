package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {

	WebDriver driver;
	String browserType = "chrome";
	
	
	@Test
	public void hotelReservation() {
		
		driver.findElement(By.className("uitk-icon uitk-icon-hotels"));
		driver.findElement(By.id("hotel-destination-hp-hotel"));
	}
	
	@BeforeMethod
	public void setUp() {	
		
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://www.expedia.com/");
		
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
		
	}
}
