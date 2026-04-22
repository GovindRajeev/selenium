package com.abhibus.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassengerInfo {
	WebDriverWait wait;

    @FindBy(linkText = "Skip")
    WebElement skipBtn;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement mobIp;

    @FindBy(xpath = "//input[@placeholder='Email ID']")
    WebElement emailIp;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameIp;

    @FindBy(xpath = "//input[@placeholder='Age']")
    WebElement ageIp;

    @FindBy(xpath = "//button[text()='Male']")
    WebElement genderIp;

    @FindBy(xpath = "//span[contains(text(),'No')]")
    WebElement freeCancelRadio;

    @FindBy(partialLinkText  = "Continue to Pay")
    WebElement continueBtn;

    public PassengerInfo(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public void skipLoginPopup() {
        wait.until(ExpectedConditions.visibilityOf(skipBtn)).click();
    }

    public void setContactDetails() {
        wait.until(ExpectedConditions.visibilityOf(mobIp)).sendKeys("9876543217");
        wait.until(ExpectedConditions.visibilityOf(emailIp)).sendKeys("manu@gmail.com");
    }

    public void setPersonalInfo() {
        wait.until(ExpectedConditions.visibilityOf(nameIp)).sendKeys("Manu");
        wait.until(ExpectedConditions.visibilityOf(ageIp)).sendKeys("25");
        wait.until(ExpectedConditions.visibilityOf(genderIp)).click();
    }

    public void chooseCancellation() {
        wait.until(ExpectedConditions.visibilityOf(freeCancelRadio)).click();
    }

    public void continueButton() {
        wait.until(ExpectedConditions.visibilityOf(continueBtn)).click();
    }
}


