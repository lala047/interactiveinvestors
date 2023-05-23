package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ISAPeronaldetailsPage extends BasePage{

	
	public ISAPeronaldetailsPage(WebDriver driver) {

		super(driver);
	}

@FindBy(id = "ISA_emailAddress")
public WebElement txtemail;
@FindBy(id = "ISA_confirmEmailAddress")
public WebElement txtconfemail;
@FindBy(id = "Title")
public WebElement dpdwntitle;
@FindBy(id = "FirstName")
public WebElement txtfname;
@FindBy(id = "LastName")
public WebElement txtlname;
@FindBy(id = "ISA_mobileNumber")
public WebElement txtphone;
@FindBy(id = "ISA_postcodeLookup")
public WebElement txtpostcode;
@FindBy(id = "button_postcode_lookup")
public WebElement btnaddlkup;   
@FindBy(id = "ISA_addressSelector")
public WebElement dpdwnadd;
@FindBy(xpath = "//select[@id='ISA_addressSelector']")
public WebElement dpdaddsel;




@FindBy(id = "ISA_dateOfBirth")
public WebElement txtdob;
@FindBy(id = "radioButton_britishNationalRadio_Yes")
public WebElement rdnatnalYes;
@FindBy(id = "radioButton_britishNationalRadio_No")
public WebElement rdnatnalNo;
@FindBy(xpath = "//select[@id='countrySelector_ISA_countryOfBirth']")
public WebElement dpdbithctry;




@FindBy(id = "radioButton_secondNationalityRadio_Yes")
public WebElement rdsecnatnalYes;
@FindBy(id = "radioButton_secondNationalityRadio_No")
public WebElement rdsecnatnalNo;
@FindBy(id = "ISA_first_YourNINO")
public WebElement txtni;
@FindBy(id = "radioButton_taxIdentifierSelectorRadioGroup_Yes")
public WebElement rdtaxYes; 
@FindBy(id = "radioButton_taxIdentifierSelectorRadioGroup_No")
public WebElement rdtaxNo;
@FindBy(id = "ISA_employmentStatusSelector")
public WebElement dpwdnempl;
@FindBy(id = "button_goto_step_3")
public WebElement btnstep;


public void setEmail(String email) {
	txtemail.sendKeys(email);
	
}

public void setConfEmail(String email) {
	txtconfemail.sendKeys(email);
}

public void setTitle(String value) {
Select dp=new Select(dpdwntitle);
dp.selectByVisibleText(value);
}

public void setfname(String fname) {
	txtfname.sendKeys(fname);
}

public void setlastname(String lname) {
	txtlname.sendKeys(lname);
}

public void setphonno(String phoneno) {
	txtphone.sendKeys(phoneno);
}

public void setpostcode(String pcode) throws InterruptedException {
	txtpostcode.sendKeys(pcode);
	Thread.sleep(3000);
}
public void clickfindadd() throws InterruptedException {
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,250)", "");

	dpdwnadd.sendKeys(Keys.TAB);
	dpdwnadd.sendKeys(Keys.ENTER);
	//Thread.sleep(5000);
}

public void setadd(String value) throws InterruptedException {
Select sel = new Select( dpdaddsel);
	sel.selectByVisibleText(value);
	//sel.selectByVisibleText("47 Athletes Way, Manchester, M11 3NE");
	//sel.selectByIndex(6);
	
	
	Thread.sleep(3000);

}
public void setdob(String dob) {
	txtdob.sendKeys(dob);
}

public void setnationality(String nationality) {
		if(nationality.equals("Yes")){
			rdnatnalYes.click();
		}
		else if(nationality.equals("No")){
			rdnatnalNo.click();
		}else{
			rdnatnalYes.click();//Default
		}
}

public void setbirthctry(String value) {
	Select sel = new Select( dpdbithctry);
	sel.selectByVisibleText(value);
}

public void set2ndNationlity(String secondnationality) {
		if(secondnationality.equals("Yes")){
			rdsecnatnalYes.click();
		}
		else if(secondnationality.equals("No")){
			rdsecnatnalNo.click();
		}else{
			rdsecnatnalYes.click();//Default
}

}
public void setNI() {
	txtni.click();
}

public void settax(String Tax) {
	if(Tax.equals("Yes")){
		rdtaxYes.click();
	}
	else if(Tax.equals("No")){
		rdtaxNo.click();
	}else{
		rdtaxNo.click();//Default
}
}
public void setEmploystat(String value) {
	Select dp=new Select(dpwdnempl);
	dp.selectByVisibleText(value);
}

public void ClickNextStep() {
	btnstep.click();
}



}
