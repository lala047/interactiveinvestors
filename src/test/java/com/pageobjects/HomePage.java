package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);
	}

	/**
	 * I have used Java as my language and Selenium WebDriver to run my test.
	 * 
	 * I have maintained my url in Config. Properties File
	 * 
	 * Using Page Factory (Page Object Model), I have created a page class for each
	 * page and maintained my locators in each of the page class which makes it easy
	 * for me to make changes without disrupting the test scripts. I have also
	 * created action methods/functions.
	 * 
	 * I have called these functions from these page classes using the test class to
	 * run my test.
	 * 
	 * 
	 */

	@FindBy(xpath = "//button[text()= 'Accept']")
	public WebElement btnAccpt;
	@FindBy(xpath = "//span[@title='Services']")
	public WebElement dpdwnServices;
	@FindBy(xpath = "//a[text()= 'Trading Account']")
	public WebElement btntradnacct;
	@FindBy(xpath = "//div[@id='navigationItemServices']//a")
	public List<WebElement> Servicesitems;
	@FindBy(xpath = "//span[@title='Pensions']")
	public WebElement dpdwnPensions;
	@FindBy(xpath = "//div[@id='navigationItemPensions']//a")
	public List<WebElement> Penitems;
	@FindBy(xpath = "//span[@title='Investments']")
	public WebElement dpdInv;
	@FindBy(xpath = "//div[@id='navigationItemInvestments']//a")
	public List<WebElement> invitems;
	@FindBy(xpath = "//span[@title='Help & learning']")
	public WebElement dpdwnHelp;
	@FindBy(xpath = "//div[@id='navigationItemHelpLearning']//a")
	public List<WebElement> Helpitems;
	@FindBy(xpath = "//span[@title='News']")
	public WebElement dpdwnNews;
	@FindBy(xpath = "//div[@id='navigationItemHelpLearning']//a")
	public List<WebElement> Newsitems;
	@FindBy(xpath = "(//span[text()='Sign up'])[1]")
	public WebElement btnSignUp;
	
	
	
	
	

	public void AcceptCookies() {
		btnAccpt.click();

	}

	public void ClickServices() {
		dpdwnServices.click();

	}

	public void ClickTradingAccount() throws InterruptedException {
		btntradnacct.click();

	}

	public void ItirateServ() {
		System.out.println(Servicesitems.size());
		for (int i = 0; i < Servicesitems.size(); i++) {
			System.out.println(Servicesitems.get(i).getText());
		}
	}

	public void ClickPensions() {
		dpdwnPensions.click();
	}

	public void ItiratePens() {
		System.out.println(Penitems.size());
		for (int i = 0; i < Penitems.size(); i++) {
			System.out.println(Penitems.get(i).getText());
		}
	}

	public void ClickInvestment() {
		dpdInv.click();
	}

	public void ItirateInv() {
		System.out.println(invitems.size());
		for (int i = 0; i < invitems.size(); i++) {
			System.out.println(invitems.get(i).getText());
		}

	}

	public void ClickHelp() {
		dpdwnHelp.click();
	}

	public void ItirateHelp() {
		System.out.println(Helpitems.size());
		for (int i = 0; i < Helpitems.size(); i++) {
			System.out.println(Helpitems.get(i).getText());
		}
	}

	public void ClickNews() {
		dpdwnHelp.click();
	}

	public void ClickSignUp(){
		btnSignUp.click();
	}

}