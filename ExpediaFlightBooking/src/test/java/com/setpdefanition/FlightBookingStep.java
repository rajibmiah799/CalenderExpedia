package com.setpdefanition;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.BookingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBookingStep extends Base {
	BookingPage bp;

	@Given("^user one expedia homepage$")
	public void user_one_expedia_homepage() throws Throwable {
		getDriver();

		bp = PageFactory.initElements(driver, BookingPage.class);

	}

	@When("^user click on flight$")
	public void user_click_on_flight() throws Throwable {
		bp.clickflight();

	}

	@When("^user click on roundtrip$")
	public void user_click_on_roundtrip() throws Throwable {
		bp.roundTrip();

	}

	@When("^user enter flying from$")
	public void user_enter_flying_from() throws Throwable {
		bp.enterAirport();

	}

	@When("^user enter destination$")
	public void user_enter_destination() throws Throwable {
		bp.enterdestination();

	}

	@When("^user choose deperting date month$")
	public void user_choose_deperting_date_month() throws Throwable {
		bp.departing();

	}

	@When("^user choose returning date month$")
	public void user_choose_returning_date_month() throws Throwable {
		bp.destination();

	}

	
	@When("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		bp.searckclick();

	}

	@Then("^user get some relevent results$")
	public void user_get_some_relevent_results() throws Throwable {

	}

}
