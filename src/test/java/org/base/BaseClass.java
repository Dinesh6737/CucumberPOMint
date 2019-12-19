package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.step.Hooks;

public class BaseClass {
	public static void launch(String url) {
		Hooks.driver.get(url);
	}
	public static void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void press(WebElement w) {
		w.click();
		
	}
	public void select(WebElement w,String st) {
		Select s = new Select(w);
		s.selectByVisibleText(st);
	}
	public void alert() {
		Alert a = Hooks.driver.switchTo().alert();
		a.accept();
		
	}
	public void scroll(WebElement w) {
		JavascriptExecutor j = (JavascriptExecutor) Hooks.driver;
		j.executeAsyncScript("arguments[0].scrollIntoView(true)", w);
	}
	public void screenshot(String path) throws IOException {
		TakesScreenshot t =(TakesScreenshot)Hooks.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

}
