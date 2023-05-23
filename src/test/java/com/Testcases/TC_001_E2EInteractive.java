package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.TradingPage;
import com.testBase.BaseClass;

public class TC_001_E2EInteractive extends BaseClass {

	/**
	 * From the Test Class, I have extended the Base Class to acquire common
	 * functions like Webdriver Inititaion, Implicit wait, loading the config file
	 * etc.
	 * 
	 * Using the xml file, I have parameterised my test and executed my test case.
	 * I have used the ExtentReportingUtility to configure my report.
	 * In terms of Reporting, I have used the extent Report which comes with a time stamp
	 * 
	 * I would suggest to the developer that the header items in the top nav bar
	 * should contain dropdown for easier iterations
	 * 
	 * 
	 */

	//@Test(invocationCount = 5)
	@Test
	public void Test1() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.AcceptCookies();
		hp.ClickServices();
		hp.ClickTradingAccount();

//Asserting that I have landed on the expected URL 
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.ii.co.uk/ii-accounts/trading-account");

//Asserting that I have landed on the trading account page
		TradingPage tp = new TradingPage(driver);
		boolean targetpage = tp.isTradingAccountPageExists();

		try {
			Assert.assertEquals(targetpage, true);
		}

		catch (Exception e) {
			Assert.fail();
		}

// Asserting that Login Button is present on the Trading Account Page
		boolean targetpage2 = tp.LoginBtnExists();

		try {
			Assert.assertEquals(targetpage2, true);
		}

		catch (Exception e) {
			Assert.fail();
		}

		// Asserting that SignUp Button is present on the Trading Account Page
		boolean targetpage3 = tp.SignupBtnExists();

		try {
			Assert.assertEquals(targetpage3, true);
		}

		catch (Exception e) {
			Assert.fail();
		}

		hp.ClickServices();
		hp.ItirateServ();
		hp.ClickPensions();
		hp.ItiratePens();
		hp.ClickInvestment();
		hp.ItirateInv();
		hp.ClickHelp();
		hp.ItirateHelp();
		hp.ClickNews();

	}

}
