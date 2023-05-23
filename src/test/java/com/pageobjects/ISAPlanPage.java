package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISAPlanPage extends BasePage{

	public ISAPlanPage(WebDriver driver) {

		super(driver);
	}

@FindBy(xpath = "//button[normalize-space()='Next']")
	public WebElement btnNext;




public void ClickNext() {
	btnNext.click();

}
}