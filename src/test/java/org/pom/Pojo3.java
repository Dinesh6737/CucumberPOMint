package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo3 {
	public Pojo3() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(name ="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement addres;
	@FindBy(name="cc_num")
	private WebElement ccum;
	@FindBy(name ="cc_type")
	private WebElement cctype;
	@FindBy(name="cc_exp_month")
	private WebElement xpmonth;
	@FindBy(name="cc_exp_year")
	private WebElement xpyear;
	@FindBy(name ="cc_cvv")
	private WebElement cvv;
	@FindBy(name="book_now")
	private WebElement booknowbtn;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getCcum() {
		return ccum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getXpmonth() {
		return xpmonth;
	}
	public WebElement getXpyear() {
		return xpyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknowbtn() {
		return booknowbtn;
	}
	

}
