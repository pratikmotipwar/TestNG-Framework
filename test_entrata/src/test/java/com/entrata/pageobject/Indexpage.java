package com.entrata.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Indexpage {
	
	//create object of webdriver
	WebDriver driver;
	public String Verifytext;
	public String HomeText;
	
	
	public Select s; 
	
	
	public Indexpage(WebDriver rdriver) {
		driver = rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	//Identify WebElements
	@FindBy(xpath="//a[text()='Sign In'][1]")
	public WebElement signIn;
	
	@FindBy(xpath="(//*[contains(text(),'Resources')])[1]")
	public WebElement nevigatee;
	
	@FindBy(xpath="//a[@title='Resident Portal Login Button'] ") // //a[text()='Resident Login']
	public WebElement verify;
	
	
	@FindBy(xpath="//button[text()='Accept Cookies']")
	public WebElement Accept;
	
	@FindBy(xpath="(//*[@class='button-default solid-dark-button'])[1]")
	public WebElement HomeAssert;
	
	
	
	@FindBy(xpath="(//*[@ id='object-target-locale-code'])[3]")
	public WebElement languagedropdown;
	
	@FindBy(xpath="//*[@class='start-button website-button']")
	public WebElement viewwebsite;
	
	@FindBy(xpath="(//*[@href='#app-contact'])[3]")
	public WebElement contactus;
	
	@FindBy(xpath="//*[@id='name']")
	public WebElement entername;
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement enteremail;
	
	@FindBy(xpath="//*[@id='property_name']")
	public WebElement enterpropertyname;
	
	@FindBy(xpath="//*[@id='property_url']")
	public WebElement enterpropertyurl;
	
	@FindBy(xpath="//*[@name='customer[category]']")
	public WebElement enterdropdown;
	
	@FindBy(xpath="//*[@placeholder='Message']")
	public WebElement entermessage;
	
	
	
	
	
	//Identify action on webelement
	
	public void click(WebElement element){
		element.click();
		
	}
	
	public void selectDropByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
		
	}
	
	public void selectDropByString(WebElement element,String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void gettext(){
		Verifytext=verify.getText();
	}
	
	public void sendValue(WebElement element,  String sendKeyValue) {
		element.sendKeys(sendKeyValue);
	}
	
	
	public void getHomeText(){
		HomeText=HomeAssert.getText();
		 
	}
	
	
		
	
	
		
	
		
	

	
		
	}


