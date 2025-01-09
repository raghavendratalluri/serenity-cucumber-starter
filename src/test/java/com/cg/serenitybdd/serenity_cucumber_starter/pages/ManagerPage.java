package com.cg.serenitybdd.serenity_cucumber_starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ManagerPage extends PageObject{

	private static final String ADD_CUSTOMER = "//button[contains(text(),'Add Customer')]";
	
	@FindBy(xpath = ADD_CUSTOMER)
	WebElement addCustomerLink;
	
	public void clickOnAddCustomerLink() {
		addCustomerLink.click();
	}
}
