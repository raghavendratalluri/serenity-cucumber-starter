package com.cg.serenitybdd.serenity_cucumber_starter.steps;

import org.junit.Assert;

import com.cg.serenitybdd.serenity_cucumber_starter.pages.NewCustomerPage;
import com.cg.serenitybdd.serenity_cucumber_starter.pages.NewCustomerPageXYZBankPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;

public class CreateCustomerSteps {

	protected NewCustomerPage newCustomerPage;
	protected NewCustomerPageXYZBankPage newCustomerPageXYZBankPage;

	@Step
	public void whenUserEntersAllCustomerData() {
		newCustomerPage.fillCustomerValues();
	}

	@Step
	public void whenUserEntersAllCustomerData(String customerName,
			String gender, String dob, String addr, String city, String state,
			String pin, String mobileNumber, String eMail, String passWord) {
		newCustomerPage.fillCustomerValues(customerName,gender,dob,addr,city,state,pin,mobileNumber,eMail,passWord);
	}

	@Step
	public void whenUserSaveCustomer() {
		newCustomerPage.saveCustomer();
	}
	
	@Step
	public void fillCustomerDetailsInXYZBankPage(String fname, String lname, String postcode) {
		newCustomerPageXYZBankPage.enterFirstName(fname);
		Serenity.takeScreenshot();
		newCustomerPageXYZBankPage.enterLastName(lname);
		newCustomerPageXYZBankPage.enterPostCode(postcode);
		newCustomerPageXYZBankPage.clickAddCustomerButton();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newCustomerPageXYZBankPage.getAlert().accept();
	}

	public void thenUserShouldBeAbleToSeeCustomerRegisteredSuccessfully() {
		Assert.assertEquals("Customer Registered Successfully!!!",
				newCustomerPage.getCustomerRegisteredSuccessfullyTableHeading());
	}
}
