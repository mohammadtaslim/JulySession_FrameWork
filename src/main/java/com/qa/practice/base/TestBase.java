package com.qa.practice.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	public static Properties pro;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	
	
	public void driver_int() throws IOException{
		
	 pro = new Properties();
	 fis = new  FileInputStream("C:\\Users\\tasli\\Downloads\\java\\JulySessionFrameWork\\src\\main\\java\\com\\qa\\practice\\config\\configuration.properties");
	 
	pro.load(fis);
	String browser_name = pro.getProperty("browser");
	
	if (browser_name.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	else if (browser_name.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		
	}
	else if (browser_name.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		}
	else if(browser_name.equalsIgnoreCase("safari")) {
		//
	}
	else if (browser_name.equalsIgnoreCase("opera")) {
		//
	}
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	
	driver.get("https://www.macys.com/account/signin");
	
	
	}
	public static void main (String[]args) throws IOException{
		 TestBase b = new TestBase();
		 b.driver_int();
	}
}
