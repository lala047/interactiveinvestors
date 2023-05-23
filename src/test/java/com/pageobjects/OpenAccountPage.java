package com.pageobjects;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class OpenAccountPage extends BasePage{
	
	public OpenAccountPage(WebDriver driver) {

		super(driver);
		
	}

@FindBy(xpath = "(//a[span[@title='Open an ISA']])[1]")
	public WebElement btnopenISA;



 public void clickOpenISA() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(10000); 
	btnopenISA.click(); 
	
	
	/*Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(btnopenISA));  
	//wait.until(ExpectedConditions.elementToBeClickable(btnopenISA));//elementToBeClickable
	*/
	

	//GENERIC USE OF FLUENT WAIT
	/* public static WebElement waitForElementWIthFluentWait(WebDriver driver, final WebElement locator) {
	
	//Fluent Wait Declaration
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)				
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))			
			.ignoring(NoSuchElementException.class); 
	
	//Usage
	WebElement element= wait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver ) {
			return (WebElement) (locator); 
			
		}
		});
	return element; 
		

}
	
	public void clickOpenISA() throws InterruptedException {  
		waitForElementWIthFluentWait(driver,btnopenISA); 
	
}  */ 
} 

}
