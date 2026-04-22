package come.abhibus.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoHomePage { 
	
	By fromLocationIp =By.xpath("//p[@data-testid='originId']/ancestor::div[3]");
	By fromLocationtxtBx =By.xpath("//label[text()='From']/following-sibling::input");
	By toLocationIp =By.xpath("//p[@data-testid='destinationId']/ancestor::div[3]");
	By toLocationtxtBx =By.xpath("//label[text()='To']/following-sibling::input");
	By departureDtIp =By.xpath("//p[@data-testid='departureDate']/ancestor::div[3]");
	By searchBtn =By.xpath("//button[text()='Search']");
	
	public void setFromlocation() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(fromLocationIp).click();
		driver.findElement(fromLocationtxtBx).sendKeys("kochi");
		driver.findElement(By.xpath("//span[contains(text(),'Kochi')]/ancestor::div[1]")).click();
		driver.findElement(toLocationtxtBx).sendKeys("Bangalore");
		driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]/ancestor::div[1]")).click();
	}
	

}
