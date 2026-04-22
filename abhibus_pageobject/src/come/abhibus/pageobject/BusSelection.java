package come.abhibus.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusSelection {

	WebDriverWait wait;
	By selectseatBtn =By.xpath("(//button[text()='Select Seats'])[2]");
	By selectedseatBtn =By.xpath("//*[@fill='white']/ancestor::button[@class='seat sleeper']");
	By boardingPointRadio =By.xpath("//div[@id='place-container']//label");
	By dropPtRadio =By.xpath("//div[@id='place-container']//label");
	By procceedBtn =By.xpath("//button[text()='Proceed']");
	
public BusSelection(WebDriver driver) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
public void SelectSeats() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectseatBtn)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectedseatBtn)).click();	
}
public void chooseStops() {
	wait.until(ExpectedConditions.elementToBeClickable(boardingPointRadio)).click();	
	wait.until(ExpectedConditions.visibilityOfElementLocated(dropPtRadio)).click();	
}
public void clickProccedBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(procceedBtn)).click();	
}

}
