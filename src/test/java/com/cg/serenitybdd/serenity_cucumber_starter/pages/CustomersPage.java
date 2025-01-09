package com.cg.serenitybdd.serenity_cucumber_starter.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class CustomersPage extends PageObject{
	private static final String CUSTOMERS_BTN = "//button[contains(text(),'Customers')]";
	private String valueVerifications = "//td[contains(text(),'value')]";
	
	public void clickCustomersSection() {
		getDriver().findElement(By.xpath(CUSTOMERS_BTN)).click();
	}
	
	public void verifyTheValueIsPresented(String value) {
		Assert.assertTrue(value + " is not presented in the page", getDriver().findElement(By.xpath(valueVerifications.replaceAll("value", value))).isDisplayed());
	} 
}
