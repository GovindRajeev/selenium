package com.abhibus.pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriverWait wait;

	@FindBy(xpath = "//input[@placeholder='Leaving From']")
	WebElement fromIp;
	@FindBy(xpath = "//input[@placeholder='Going To']")
	WebElement toIp;
	@FindBy(xpath = "//input[@placeholder='Onward Journey Date']")
	WebElement departureDate;
	@FindBy(xpath = "//span[text()='Search']/parent::a")
	WebElement searchbtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public void setLocationDetails() {
		wait.until(ExpectedConditions.visibilityOf(fromIp)).sendKeys("Kochi");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Kochi']/parent::div")))
				.click();
		wait.until(ExpectedConditions.visibilityOf(toIp)).sendKeys("Bangalore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Bangalore']/parent::div")))
				.click();
	}

	public void setTravelDate() {
		wait.until(ExpectedConditions.visibilityOf(departureDate)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='30']"))).click();

	}

public void clickSearchbtn() {
	wait.until(ExpectedConditions.visibilityOf(searchbtn)).click();
}

}
