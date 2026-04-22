package com.abhibus.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusSelection {
	 WebDriver driver;
     WebDriverWait wait;

    @FindBy(xpath = "(//button[text()='Select Seats'])[2]")
    WebElement selectSeatBtn;

    @FindBy(xpath = "//*[@fill='white']/ancestor::button[@class='seat sleeper']")
     WebElement selectedSeatBtn;

    @FindBy(xpath = "//div[@id='place-container']//label")
    WebElement boardingPointRadio;

    @FindBy(xpath = "//div[@id='place-container']//label")
    WebElement dropPtRadio;

    @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceedBtn;

    public BusSelection(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public void selectSeats() {
        wait.until(ExpectedConditions.visibilityOf(selectSeatBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(selectedSeatBtn)).click();
    }

    public void chooseStops() {
        wait.until(ExpectedConditions.elementToBeClickable(boardingPointRadio)).click();
        wait.until(ExpectedConditions.visibilityOf(dropPtRadio)).click();
    }

    public void clickProceedBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedBtn)).click();
    }
}



