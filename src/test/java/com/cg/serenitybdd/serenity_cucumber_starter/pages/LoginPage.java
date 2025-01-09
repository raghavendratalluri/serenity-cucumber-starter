package com.cg.serenitybdd.serenity_cucumber_starter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login")
public class LoginPage extends PageObject{

	private static final String USER_ID = "uid";
	private static final String PASS_WORD = "password";
	private static final String LOGIN = "btnLogin";
	private String loginUserType = "//button[contains(text(),'userType')]";
	
	@FindBy(name = USER_ID)
	WebElement userId;
	@FindBy(name = PASS_WORD)
	WebElement passWord;
	@FindBy(name = LOGIN)
	WebElement login;
	
	public void openXYZBankLoginPage() {
		open();
		getDriver().manage().window().maximize();
	}
	
	public void enterLoginUserType(String user) {
		getDriver().findElement(By.xpath(this.loginUserType.replaceAll("userType", user))).click();
	}
	
}
