package com.abhibus.test;

import org.testng.annotations.Test;

import com.abhibus.pagefactory.BusSelection;
import com.abhibus.pagefactory.HomePage;
import com.abhibus.pagefactory.PassengerInfo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class Tc_01_BusBooking {
	WebDriver driver;

	@Test
	public void busBooking() {
		driver.get("https://www.abhibus.com/");

		HomePage oHomePage = new HomePage(driver);
		oHomePage.setLocationDetails();
		oHomePage.setTravelDate();
		oHomePage.clickSearchbtn();

		BusSelection oBusSelection = new BusSelection(driver);
		oBusSelection.selectSeats();
		oBusSelection.chooseStops();
		oBusSelection.clickProceedBtn();

		PassengerInfo oPassengerInfo = new PassengerInfo(driver);
		oPassengerInfo.skipLoginPopup();
		oPassengerInfo.setContactDetails();
		oPassengerInfo.setPersonalInfo();
		oPassengerInfo.chooseCancellation();
		oPassengerInfo.continueButton();

	}
    @Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String sbrowser) throws Exception {

    	System.out.println("Value from Xml file is" + sbrowser);
		if (sbrowser.equalsIgnoreCase("chrome")) {
			this.driver = new ChromeDriver();
		} else if (sbrowser.equalsIgnoreCase("Edge")) {
			this.driver = new EdgeDriver();
		} else if(sbrowser.equalsIgnoreCase("firefox")) {
			this.driver=new FirefoxDriver();
		} else if(sbrowser.equalsIgnoreCase("safari")) {
			this.driver=new SafariDriver();
		} else
			  throw new Exception("Invalid browser Exception !! please provide a valid browser");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterTest
	public void afterTest() {
	}

}
