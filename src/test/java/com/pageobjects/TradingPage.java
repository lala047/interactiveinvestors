package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingPage extends BasePage {

	public TradingPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//h1[text()='Trading Account']")
	public WebElement txtTradngAcct;
	@FindBy(xpath = "(//span[text()='Log in'])[1]")
	public WebElement btnLogin;
	@FindBy(xpath = "(//span[text()='Sign up'])[1]")
	public WebElement signupLogin;

	public boolean isTradingAccountPageExists() {
		try {
			return (txtTradngAcct.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	public boolean LoginBtnExists() {
		try {
			return (btnLogin.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	public boolean SignupBtnExists() {
		try {
			return (btnLogin.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

}
