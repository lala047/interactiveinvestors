package com.Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.testBase.BaseClass;



public class TC_001_E2EInteractive extends BaseClass{
	
	
	
	@Test
	public void Test1() throws InterruptedException {
		HomePage hp= new HomePage(driver);
		hp.AcceptCookies();
		hp.ClickServices();
		hp.ClickTradingAccount();
		Thread.sleep(3000);
		
		
		String url= driver.getCurrentUrl();
	
		
Assert.assertEquals(url, "https://www.ii.co.uk/ii-accounts/trading-account");

hp.ClickServices();
Thread.sleep(10000);
hp.ItirateServ();


}
}