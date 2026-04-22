package come.abhibus.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	By flightBtn=By.id("flights-link");//assign the id,xpath to a variable
	By leavingFromIp =By.xpath("//input[@placeholder='Leaving From']");
	By goingToIp =By.xpath("//input[@placeholder='Going To']");
	By departureDtIp =By.xpath("//input[@placeholder='Onward Journey Date']");
	By searchBtn =By.xpath("//span[text()='Search']");

	public Homepage(WebDriver driver) {//constuctor to call driver details from main page
		this.driver = driver;
	}
	public void navigateToFlights() {//create a function for every action
		driver.findElement(flightBtn).click();//the assigned variable is used to call the id or xpath
	}
	public void setlocation() {
		driver.findElement(leavingFromIp).sendKeys("kochi");
		driver.findElement(By.xpath("//div[text()='Kochi']/parent::div")).click();
		driver.findElement(goingToIp).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']/parent::div")).click();
	}
	public void setTravelDate() {
		driver.findElement(departureDtIp).click();
		driver.findElement(By.xpath("//a[text()='5']")).click();
	}
	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
		
	}
	
}
