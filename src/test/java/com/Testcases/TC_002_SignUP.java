package com.Testcases;

import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.ISAPeronaldetailsPage;
import com.pageobjects.ISAPlanPage;
import com.pageobjects.OpenAccountPage;
import com.pageobjects.SelectISAPlanPage;
import com.testBase.BaseClass;

public class TC_002_SignUP extends BaseClass{
	
	@Test
	
	public void SignUpTest() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.AcceptCookies();
		hp.ClickSignUp();
		Thread.sleep(3000);
		
		OpenAccountPage oa=new OpenAccountPage(driver);
		
		System.out.println("click on Open ISA ACCOunt");
		oa.clickOpenISA();
		
		Thread.sleep(3000);

		SelectISAPlanPage is=new SelectISAPlanPage(driver);
		is.ClickInvestorEssentials();
		Thread.sleep(5000);
		
		ISAPlanPage isp= new ISAPlanPage(driver);
		isp.ClickNext();
		
		ISAPeronaldetailsPage id= new ISAPeronaldetailsPage(driver);
		id.setEmail("emmaighedo@gmail.com");
		id.setConfEmail("emmaighedo@gmail.com");
		id.setTitle("Mr");
		id.setfname("emma");
		//id.setfname(randomeString());
		id.setlastname("lala");
		//id.setlastname(randomeString());
		id.setphonno("07546738975");
		id.setpostcode("M113NE");
		System.out.println("clicked on postcode");
		Thread.sleep(3000);
		
		id.clickfindadd();
		System.out.println("click on Open find add");
		id.setadd("47 Athletes Way, Manchester, M11 3NE");
		System.out.println("click on choose add");
		
		id.setdob("12/12/2000");
		id.setnationality("Yes");
		
		
		id.setbirthctry("United Kingdom");
		
		id.set2ndNationlity("No");
		id.setNI();
		id.settax("No");
		id.setEmploystat("Student");
		id.ClickNextStep();
	}

}
