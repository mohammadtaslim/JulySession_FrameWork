package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.practice.base.TestBase;
import com.qa.practice.pages.loginPage;

public class loginPagetest extends TestBase{
	//need to extends seleniun WebDriver from super class TestBase
	//need to import hence it is in a different package 
	
	loginPage lie;
	
	
	@ BeforeMethod
public void setup() throws IOException {
		//loginPage lp = new loginPage();
		driver_int();
		lie = new loginPage();
	}
		//driver_int();
		 //initializing the loging page,bringing the reference variable
		 //declaring the reference variable in global so that can be excesed 
		//we need to invocation the class that it can electrify 
		//bringing the driver and setting up the url
		
	
	
	
	@Test
	public void phpLogoTest() {
		loginPage lp = new loginPage();  //need to import the loginPage hence it is in a different package
		Assert.assertTrue(lie.phplogo());
		//lp.phplogo(); //verifying if the loginPage logo is displayed or not
	}
	
	
	
	@Test
	public void securePaymentLogoTest() {
		//Assert.assertTrue(true);
		loginPage lie = new loginPage();
		Assert.assertTrue(true);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		}
	
	
}
//api with no electricity shows java.lang.NullPointerException
//pom=page object model<----> separate page <>separate locator || separate page <>separate testcases