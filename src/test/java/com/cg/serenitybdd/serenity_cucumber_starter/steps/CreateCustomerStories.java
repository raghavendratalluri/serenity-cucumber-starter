package com.cg.serenitybdd.serenity_cucumber_starter.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CreateCustomerStories {
	@Steps
	SerenityExSteps serenityExSteps;
	@Steps
	CreateCustomerSteps createCustomerSteps;
	@Steps
	CustomerVerificationSteps customerVerificationSteps;

	@Given("{string} logs in to XYZ Bank Page")
	public void givenuserIsInAddNewCustomerPage(String user) {
		serenityExSteps.givenuserIsInXYZBankPage(user);
	}
	
	@Given("selects add customer")
	public void givenSelectsAddCustomer() {
		serenityExSteps.whenUserSelectsAddCustomerLink();
	}
	
	@When("bank manager adds new customer")
	public void whenBankManagerAddsNewCustomer() {
		createCustomerSteps.fillCustomerDetailsInXYZBankPage("Test", "ABCD", "A1B2C3");
	}
	
	@Then("manager should be able to see new customer in customers section")
	public void verifyNewCustomerInCustomersSection() {
		customerVerificationSteps.verifyTheNewCustomerInCustomersTab("Test", "ABCD", "A1B2C3");
	}

}