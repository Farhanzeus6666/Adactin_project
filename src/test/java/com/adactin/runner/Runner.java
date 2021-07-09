package com.adactin.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClassa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
                    glue = "com\\adactin\\stepdefinition",monochrome = true)
       
public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		
		driver = BaseClassa.browserlanch("Chrome");

	}
	
	//@AfterClass
	//public static void tearDown() {
		//driver.quit();
		

	}
		
	
	


 