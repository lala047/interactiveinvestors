package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradingPage extends BasePage{
	


	public TradingPage(WebDriver driver) {
		
		super(driver);
		}
			
	@FindBy(xpath="//h1[text()='Trading Account']") public WebElement txtTradngAcct;
	@FindBy(xpath = "//span[@title='Services']") public WebElement dpdwnServices;
	@FindBy(xpath = "//a[text()= 'Trading Account']") public WebElement btntradnacct;  
	



	
}
