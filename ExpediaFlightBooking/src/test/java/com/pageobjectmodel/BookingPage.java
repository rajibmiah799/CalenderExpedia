package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	WebDriver driver;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='tab-flight-tab-hp']")
	WebElement editFlight;

	public void clickflight() {
		editFlight.click();

	}

	@FindBy(xpath = "//label[@id='flight-type-roundtrip-label-hp-flight']")
	WebElement edittrip;

	public void roundTrip() {
		edittrip.click();
	}

	@FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
	WebElement flyfrom;

	public void enterAirport() {

		flyfrom.sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");

	}

	@FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
	WebElement editdesti;

	public void enterdestination() {
		editdesti.sendKeys("London (LHR-Heathrow)");
	}

	public void departing() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']")).click();

		while (true) {
			String month = "Aug 2020";
			String mon = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();

			if (mon.equals(month)) {
				break;
			} else {
				driver.findElement(
						By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))
						.click();

				Thread.sleep(1000);
			} // end if
			driver.findElement(
					By.xpath("(//div[@class='datepicker-cal-month']//table//tbody//tr[2]//td[2]//button)[1]")).click();

		} // end while
	}// end deperting

	public void destination() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']")).click();

		while (true) {
			String month = "Oct 2020";
			String mon = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();
			if (mon.equals(month)) {
				break;
			} else {
				driver.findElement(
						By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']"))
						.click();
				Thread.sleep(1000);
			} // end if
			driver.findElement(By.xpath("(//button[contains(@class,'datepicker-cal-date')])[59]")).click();

		} // end while

	}// end destination

	@FindBy(xpath = "(//button[@class='btn-primary btn-action  gcw-submit'])[1]")
	WebElement clicksearch;

	public void searckclick() {
		clicksearch.click();

	}

}
