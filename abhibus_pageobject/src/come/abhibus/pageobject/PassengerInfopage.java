package come.abhibus.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassengerInfopage {
	
	WebDriverWait wait;
	By skipBtn =By.linkText("Skip");
	By mobileNoIp =By.xpath("//input[@placeholder='Mobile Number']");
	By emailidIp =By.xpath("//input[@placeholder='Email ID']");
	By nameIp =By.xpath("//input[@placeholder='Name']");
	By ageIp =By.xpath("//input[@placeholder='Age']");
	By genderBtn =By.xpath("//button[text()='Male']");
	By freeCancelRadio =By.xpath("//span[contains(text(),'No')]");
	By continueBtn =By.partialLinkText("Continue to Pay ");
	
	public PassengerInfopage(WebDriver driver) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void skiploginPopup() {
		wait.until(ExpectedConditions.elementToBeClickable(skipBtn)).click();
	}
	public void setcontactDetails() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNoIp)).sendKeys("7676543212");
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailidIp)).sendKeys("monkeydluffy@onepiece.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameIp)).sendKeys("luffy");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ageIp)).sendKeys("25");
		wait.until(ExpectedConditions.visibilityOfElementLocated(genderBtn)).click();
	}
	public void chooseCancelation() {
		wait.until(ExpectedConditions.elementToBeClickable(freeCancelRadio)).click();		
	}
	public void continueto() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();		
	}


	
	
	
	

}
