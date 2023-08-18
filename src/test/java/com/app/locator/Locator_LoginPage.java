package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class Locator_LoginPage extends BaseClass {
	
	public static WebElement user() {
		return driver.findElement(By.id("username"));
		
	}

}
