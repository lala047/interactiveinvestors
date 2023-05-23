package com.pageobjects;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectISAPlanPage extends BasePage{
	
	public SelectISAPlanPage(WebDriver driver) {

		super(driver);
	}

@FindBy(xpath = "//button[text()='Investor Essentials']")
	public WebElement btngetInvestorEssentials;



public void ClickInvestorEssentials() throws InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()", btngetInvestorEssentials);
btngetInvestorEssentials.click();
Thread.sleep(3000);
}

}