package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo5 {
	public Pojo5() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(name="ids[]")
	private WebElement id;
	@FindBy(name="cancelall")
	private WebElement cancel;
	@FindBy(name ="logout")
	private WebElement lgout;
	public WebElement getId() {
		return id;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getLgout() {
		return lgout;
	}
	

}
