package com.entrat.testclasses;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.entrata.pageobject.Indexpage;
import com.text_entrata.utilities.readconfig;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass extends readconfig{
	
 public WebDriver driver;
	 
 @BeforeClass
	 public void setup() {
		 
		 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			//Launching url
			driver.get(value);
			//Proving implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//To maximize window
			driver.manage().window().maximize();
	 }
	 

	 
	 @AfterClass
	 public void tearDown() {
		 driver.close();
     	
	 }

}
