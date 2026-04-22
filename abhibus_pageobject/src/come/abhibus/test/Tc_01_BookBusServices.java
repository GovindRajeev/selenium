package come.abhibus.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import come.abhibus.pageobject.BusSelection;
import come.abhibus.pageobject.Homepage;
import come.abhibus.pageobject.PassengerInfopage;

public class Tc_01_BookBusServices {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.abhibus.com/");
		Homepage oHomepage= new Homepage(driver);
		BusSelection oBusSelection = new BusSelection(driver);
		PassengerInfopage oPassengerInfopage = new PassengerInfopage(driver); 
		oHomepage.setlocation();
		oHomepage.setTravelDate();
		oHomepage.clickSearchBtn();
//		BusSelection oBusSelection = new BusSelection(driver);
		oBusSelection.SelectSeats();
		oBusSelection.chooseStops();
		oBusSelection.clickProccedBtn();
//		PassengerInfopage oPassengerInfopage = new PassengerInfopage(driver);
		oPassengerInfopage.skiploginPopup();
		oPassengerInfopage.setcontactDetails();
		oPassengerInfopage.chooseCancelation();
		oPassengerInfopage.continueto();
		
	}

}
