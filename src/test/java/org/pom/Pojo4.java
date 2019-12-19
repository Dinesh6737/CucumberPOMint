package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo4 {
	public Pojo4() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(name ="search_hotel")
	private WebElement search;
	@FindBy(xpath="//*[@id=\"my_itinerary\"]")
	private WebElement myitinerery;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getMyitinerery() {
		return myitinerery;
	}
}
