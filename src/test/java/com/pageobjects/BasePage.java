package com.pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
public  WebDriver driver;
public static WebDriverWait wait;

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

		
		

		   // wait for page to load
	 //wait= new WebDriverWait(driver, 5);
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}

}
