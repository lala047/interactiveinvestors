package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		
			
			super(driver);
			}
				
		@FindBy(xpath="//button[text()= 'Accept']") public WebElement btnAccpt;
		@FindBy(xpath = "//span[@title='Services']") public WebElement dpdwnServices;
		@FindBy(xpath = "//a[text()= 'Trading Account']") public WebElement btntradnacct;  
		@FindBy(xpath="//a[contains(normalize-space(),'Logout')]") public WebElement lnkLogout;
		
		
		

	public void AcceptCookies (){
		btnAccpt.click();
		
		}
	public void ClickServices (){
		dpdwnServices.click();
			
	}
	public void ClickTradingAccount () throws InterruptedException{
		Actions act= new Actions(driver);
		act.moveToElement(dpdwnServices).perform();
		btntradnacct.click();
		
		
	}
	public void ItirateServ() {

	
	Select sel = new Select(dpdwnServices);
	List<WebElement> li = sel.getOptions();

	//System.out.println(li.size());

	for (int i = 0; i < li.size(); i++) {

		li.get(i).click(); 
		System.out.println(li.get(i).getText());
}

	}
}