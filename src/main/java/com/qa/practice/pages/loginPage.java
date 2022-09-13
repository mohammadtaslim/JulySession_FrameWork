package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.base.TestBase;

public class loginPage extends TestBase{
	//extend the driver from super class by extends 
	//we need to import the class hence it is under another package
	
	////input[@name='email']
	//input[@name='password']
	//button[@type='submit']
	//"(//img[@alt='logo'])[1]"
	//OR stands for Object Repository
	
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath="(//img[@alt='logo'])[1]")
	WebElement logo; 
	@FindBy(css="div[class='icon-box icon-layout-2 d-flex bg-light']")
	 WebElement  securePaymentLogo;
	
	//we need to initialize the object repositories by creating a constuctor of the same exact class 
	
	public loginPage() {  // constructor created
		                  //press control+loginPage
		PageFactory.initElements(driver, this);
		//initialize by the driver 
		//this refers to local class instances
		//initialize done
	}
	
	
	public  boolean phplogo() {
		return logo.isDisplayed();
	}
	public boolean securePayment() {
		return securePaymentLogo.isDisplayed();
	}
}
