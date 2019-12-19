package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo1 {
	public Pojo1() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(name="room_type")
	private WebElement roomtype;
	@FindBy(name ="room_nos")
	private WebElement roomno;
	@FindBy(name="datepick_in")
	private WebElement datepickin;
	@FindBy(name="datepick_out")
	private WebElement datepickout;
	@FindBy(name="adult_room")
	private WebElement adultroom;
	@FindBy(name="child_room")
	private WebElement childroom;
	@FindBy(name="Submit")
	private WebElement submitbtn;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDatepickin() {
		return datepickin;
	}
	public WebElement getDatepickout() {
		return datepickout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
