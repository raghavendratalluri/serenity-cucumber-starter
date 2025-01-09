package com.cg.serenitybdd.serenity_cucumber_starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class NewCustomerPageXYZBankPage extends PageObject{

	private static final String FIRST_NAME = "//label[text()='First Name :']/following::input[1]";
	private static final String LAST_NAME = "//label[text()='Last Name :']/following::input[1]";
	private static final String POSTCODE = "//label[text()='Post Code :']/following::input[1]";
	private static final String ADD_CUSTOMER_BTN = "//button[text()='Add Customer']";
	
	public void enterFirstName(String fname) {
		getDriver().findElement(By.xpath(FIRST_NAME)).sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		getDriver().findElement(By.xpath(LAST_NAME)).sendKeys(lname);
	}
	
	public void enterPostCode(String postcode) {
		getDriver().findElement(By.xpath(POSTCODE)).sendKeys(postcode);
	}
	
	public void clickAddCustomerButton() {
		getDriver().findElement(By.xpath(ADD_CUSTOMER_BTN)).click();
	}
}
