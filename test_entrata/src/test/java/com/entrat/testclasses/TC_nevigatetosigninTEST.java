package com.entrat.testclasses;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.entrata.pageobject.Indexpage;


public class TC_nevigatetosigninTEST extends baseclass  {
	
	public Indexpage page;
	
	 
	
	// Launching the url and verifying home screen 
	@Test (priority = 1)
	public void lauchbrower() {
		page =new Indexpage(driver);
		page.click(page.Accept);
		page.getHomeText();
		//Assertion for Home screen 
		Assert.assertTrue(page.HomeText.contains("Watch Demo"));
			
	}
	
	// To Click on the sign In button and verifying whether sign In page is loaded or not 
	@Test (priority = 2)
	public void verifySignInPage() {
		page =new Indexpage(driver);
		page.click(page.signIn);
		page.gettext();
		Assert.assertTrue(page.Verifytext.contains("Resident Login"));
				
	}
	
	//Navigating back to home screen 
	@Test (priority = 3)
	public void nagvigatingToHomeScreen() {
		page =new Indexpage(driver);
		driver.navigate().back();
		//Assertion for Home screen 
		page.getHomeText();
		Assert.assertTrue(page.HomeText.contains("Watch Demo"));
		driver.navigate().forward();
		page.gettext();
		Assert.assertTrue(page.Verifytext.contains("Resident Login"));
	}
	
	@Test (priority = 4)
	public void ResidentialClick() {
		page =new Indexpage(driver);
		page.click(page.verify);	
	}
	
	
	@Test (priority = 5)
	public void LanguageDropDown() throws InterruptedException {
		page =new Indexpage(driver);
		page.click(page.languagedropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		page.selectDropByIndex(page.languagedropdown,9);		
		
	}
	@Test (priority = 6)
	public void viewWebsite() {
		page =new Indexpage(driver);
		page.click(page.viewwebsite);
	}
	@Test (priority = 7)
	public void contactUs() {
		page =new Indexpage(driver);
		page.click(page.contactus);
	}
	
	@Test (priority = 8)
	public void fillContactInfo() {
		page =new Indexpage(driver);
		page.sendValue(page.entername,"Pratik");
		page.sendValue(page.enteremail,"pratik@gmail.com");
		page.sendValue(page.enterpropertyname,"Pratik Enterprise");
		page.sendValue(page.enterpropertyurl,"Prattik_property.in");
		page.click(page.enterdropdown);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		page.selectDropByString(page.enterdropdown, "Design");
		page.sendValue(page.entermessage,"As per requirement i have entered all values without clicking submit button");
		
	}
	
	
}
