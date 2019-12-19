package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo2 {
	public Pojo2() {
		PageFactory.initElements(Hooks.driver, this);
}
	@FindBy(name="radiobutton_0")
	private WebElement radiobtn;
	@FindBy(name="continue")
	private WebElement continuebtn;
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
}
	
	