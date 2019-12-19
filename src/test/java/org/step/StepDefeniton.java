package org.step;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.pom.Pojo;
import org.pom.Pojo1;
import org.pom.Pojo2;
import org.pom.Pojo3;
import org.pom.Pojo4;
import org.pom.Pojo5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefeniton extends BaseClass {
	@Given("Open the browser and launch the application")
	public void open_the_browser_and_launch_the_application() {
		launch("https://adactin.com/HotelApp/index.php");

	}

	Pojo p = new Pojo();
	Pojo1 p1 = new Pojo1();
	Pojo2 p2 = new Pojo2();
	Pojo3 p3 = new Pojo3();
	Pojo4 p4 = new Pojo4();
	Pojo5 p5 = new Pojo5();

	@When("Login using valid credentials")
	public void login_using_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> li = dataTable.asList(String.class);
		type(p.getUser(), li.get(0));
		type(p.getPass(), li.get(1));
		press(p.getLogbtn());

	}

	@When("Search hotel by adding necessary details")
	public void search_hotel_by_adding_necessary_details(io.cucumber.datatable.DataTable dataTable) throws IOException {

		List<String> li = dataTable.asList(String.class);
		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		select(p1.getLocation(), li.get(0));
		select(p1.getHotel(), li.get(1));
		select(p1.getRoomtype(), li.get(2));
		select(p1.getRoomno(), li.get(3));
		type(p1.getDatepickin(), li.get(4));
		type(p1.getDatepickout(), li.get(5));
		select(p1.getAdultroom(), li.get(6));
		select(p1.getChildroom(), li.get(7));
		screenshot("C\\AdactinPOM\\image.png");
		press(p1.getSubmitbtn());

	}

	@Then("Screenshot the details which we have been entered na dclick continue")
	public void screenshot_the_details_which_we_have_been_entered_na_dclick_continue() throws IOException {
		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		press(p2.getRadiobtn());
		screenshot("C\\AdactinPOM\\image1.png");
		press(p2.getContinuebtn());
	}

	@Then("Enter the necessary details in the displayed page {string}{string}{string}{string}{string}{string}{string}{string} and click book now")
	public void enter_the_necessary_details_in_the_displayed_page_and_click_book_now(String string, String string2,
			String string3, String string4, String string5, String string6, String string7, String string8)
			throws IOException {

		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		type(p3.getFirstname(), string);
		type(p3.getLastname(), string2);
		type(p3.getAddres(), string3);
		type(p3.getCcum(), string4);
		type(p3.getCctype(), string5);
		type(p3.getXpmonth(), string6);
		type(p3.getXpyear(), string7);
		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		type(p3.getCvv(), string8);
		screenshot("C\\AdactinPOM\\image2.png");
		press(p3.getBooknowbtn());
	}

	@Then("Scroll down the displayed page and take screenshot and click my itenary and click the booked hotel in the displayed page then click cancel selected")
	public void scroll_down_the_displayed_page_and_take_screenshot_and_click_my_itenary_and_click_the_booked_hotel_in_the_displayed_page_then_click_cancel_selected()
			throws IOException {

		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		screenshot("C\\AdactinPOM\\image3.png");
		press(p4.getMyitinerery());
	}

	@Then("click ok to the alert")
	public void click_ok_to_the_alert() throws IOException {
		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		press(p5.getId());
		press(p5.getCancel());
		alert();
		screenshot("C\\AdactinPOM\\image4.png");

	}

	@Then("Click logout and take screenshot ,quit the browser")
	public void click_logout_and_take_screenshot_quit_the_browser() throws IOException {

		Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		press(p5.getLgout());
		screenshot("C\\\\AdactinPOM\\\\image5.png");
	}

}
