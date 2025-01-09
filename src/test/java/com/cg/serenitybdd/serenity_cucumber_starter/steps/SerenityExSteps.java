package com.cg.serenitybdd.serenity_cucumber_starter.steps;

import com.cg.serenitybdd.serenity_cucumber_starter.pages.LoginPage;
import com.cg.serenitybdd.serenity_cucumber_starter.pages.ManagerPage;
import com.cg.serenitybdd.serenity_cucumber_starter.pages.NewCustomerPage;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityExSteps extends ScenarioSteps {

	protected LoginPage loginPage;
	protected ManagerPage managerPage;
	protected NewCustomerPage newCustomerPage;

	@Step
	public void givenuserIsInXYZBankPage(String user) {
		loginPage.openXYZBankLoginPage();
		loginPage.enterLoginUserType(user);
	}

	@Step
	public void whenUserSelectsAddCustomerLink() {
		managerPage.clickOnAddCustomerLink();
	}
}
