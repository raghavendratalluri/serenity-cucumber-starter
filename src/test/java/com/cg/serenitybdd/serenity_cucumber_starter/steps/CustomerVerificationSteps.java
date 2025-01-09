package com.cg.serenitybdd.serenity_cucumber_starter.steps;

import com.cg.serenitybdd.serenity_cucumber_starter.pages.CustomersPage;

public class CustomerVerificationSteps {

	protected CustomersPage customersPage;
	
	public void verifyTheNewCustomerInCustomersTab(String fname, String lname, String postcode) {
		customersPage.clickCustomersSection();
		customersPage.verifyTheValueIsPresented(fname);
		customersPage.verifyTheValueIsPresented(lname);
		customersPage.verifyTheValueIsPresented(postcode);
	}

}
