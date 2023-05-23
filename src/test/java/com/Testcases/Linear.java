package com.Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linear {

	//public static void main(String[] args) throws InterruptedException {
@Test
public void Test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		// INTERACTIVE INVESTORS
		/*driver.get("https://www.ii.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()= 'Accept']")).click();
		driver.findElement(By.xpath("//span[@title='Investments']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='navigationItemInvestments']//li"));
		for (int i = 0; i < links.size(); i++) {
		
		System.out.println(links.get(i).getText()); */



		//AMAZON
	/*	driver.get("https://en.wikipedia.org/wiki/Test_automation");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='sidebar-list-title']")); // They all have common xpath, so, take this common xpath and create a parent xpath
		for (int i = 0; i < links.size(); i++) {
		
		System.out.println(links.get(i).getText());  */
		

		
		//NOP COMMERCE
		/*driver.get("https://demo.nopcommerce.com/electronics");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-block information']//a")); // Take the xpath of the parent(To know this: the xpath contains 'inofrmation' which is the HEADING (information)
		for (int i = 0; i < links.size(); i++) {
		
		System.out.println(links.get(i).getText()); */

		
		
		
		// PRETTY LITTLE THING
		/*
		 * driver.get("https://www.prettylittlething.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		 * Thread.sleep(3000); //WebElement clthing=
		 * driver.findElement(By.xpath("//span[text()='CLOTHING']")); WebElement
		 * clthing= driver.findElement(By.xpath("//span[normalize-space()='SPRING']"));
		 * 
		 * Actions action= new Actions(driver); action.moveToElement(clthing).perform();
		 * driver.findElement(By.xpath("(//a[text()='Dresses'])[1]")).click();
		 */

		// BOOHOO
		 driver.get("https://www.boohoo.com/"); driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//button[text()='ACCEPT ALL'])[1]")).click();
		
		
		 WebElement AllClothing = driver.findElement(By.xpath("//a[@role='menuitem'][@data-tau='menu_item_level2_all-clothing']")); //MouseHover on 'AllClothing '
		 Actions actions = new Actions(driver); 
		 actions.moveToElement(AllClothing).perform();
		 Thread.sleep(3000);
		 
		//Click on 'Tops'
		 driver.findElement(By.xpath("(//a[text()='Tops'])[1]")).click();   
		 System.out.println("clicked Tops");   
		 
		 
		 
		// select the first product
			List<WebElement> allproducts = driver.findElements(By.xpath("//h3[@class='b-product_tile-title']"));    // To identify the element of multiple elements, identify one of the elements and Store in a list
			allproducts.get(0).click();
		
		 
		 
			//STORE THE PRODUCT NAME IN A STRING	 
		String firstproduct= driver.findElement(By.xpath("//h1[@id='editProductModalTitle']")).getText();
		System.out.println(firstproduct);
		
		//select size
		driver.findElement(By.cssSelector("button[id='variation-swatch-button-1-18'] span[class='b-variation_swatch-value_text']")).click();  
		Thread.sleep(3000);
		
		//click on Add to cart
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();    
		Thread.sleep(3000);
		
		//Click on Bag icon
		 driver.findElement(By.xpath("//a[@title='View your cart']//*[name()='svg']")).click();  
		 Thread.sleep(3000); 
		 
		 //Assert the product name against the product name in your bag page. Both values should be the same (if not add a warning in the report)
		 Assert.assertEquals(firstproduct, "DISK CROCHET HALTERNECK TOP");
		 
		 //Click on 'View Cart' button
		 WebElement viewcartButton = driver.findElement(By.xpath("//a[normalize-space()='View cart']"));     
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", viewcartButton);

		
		// verify we have 1 item in the shopping cart
		String numProductsLabelText = driver.findElement(By.xpath("//span[@class='b-minicart_icon-qty']")).getText(); 
		System.out.println(numProductsLabelText);   //numProductsLabelText refers to the value of the shopping cart e.g '01' items
		int numProducts = Integer.parseInt(numProductsLabelText);     //   This converts the string(String numProductsLabelText) into an integer(numProducts) bcos the system currently see String numProductsLabelText(01) as a String bcos we used 'string'
		Assert.assertEquals(numProducts, 01); 
		
		
		// verify total price in the shopping cart
		String TotalpriceString = driver.findElement(By.xpath("//th[normalize-space()='Subtotal (excluding delivery)']")).getText(); 
		System.out.println(TotalpriceString);   
		double Totalprice = Double.parseDouble(TotalpriceString);     //   This converts the string(String numProductsLabelText) into an integer(numProducts) bcos the system currently see String numProductsLabelText(01) a String bcos we used 'string'
		//Assert.assertEquals(Totalprice, 5.40); 
		Assert.assertEquals(Totalprice,TotalpriceString ); 
		

		
		
		driver.findElement(By.xpath("(//a[text()=' Checkout '])[2]")).click();   //proceed to check out
		
		
		driver.findElement(By.id("dwfrm_login_email")).sendKeys("emmaighedo@gmail.com");
		driver.findElement(By.id("dwfrm_login_password")).sendKeys("slyman01");
		driver.findElement(By.xpath("//button[normalize-space()='Log in securely']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_firstName")).sendKeys("lala");
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_lastName")).sendKeys("slyman01");
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_phone")).sendKeys("0755423141");
		driver.findElement(By.xpath("//div[@data-ref='addressFormFields']//button[@type='button'][normalize-space()='Enter manually']")).click();
		
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_address1")).sendKeys("6 Devonshire street");
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_city")).sendKeys("Manchester");
		driver.findElement(By.id("dwfrm_shipping_shippingAddress_addressFields_postalCode")).sendKeys("M7 4rf");
		driver.findElement(By.xpath("//button[normalize-space()='Proceed to billing']")).click();
		
		//Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		
		
		
		//driver.findElement(By.xpath("//button[@id='payment-button-scheme']//span[@class='b-payment_accordion-icon']")).click();
		
		
		
			 
		driver.close();

	}
}