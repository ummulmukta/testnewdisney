package com.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class NewBase {
	
	
	
	
	

	public  WebDriver driver;
	
	public String browserName;
	
	
	  
	//@Parameters()
public  WebDriver getDriver() throws Exception{
	
	Properties prop =new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\farha\\eclipse-workspace\\DisneyWorld\\Properties\\data.properties");
	prop.load(file);
	browserName= prop.getProperty("Browsername");
	
	//System.out.println(browserName);
	System.out.println(prop.getProperty("Browsername"));
	String urll=prop.getProperty("Url");
	//System.out.print(url);
	if (browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","./Brows/chromedriver.exe");
		driver = new ChromeDriver();
	
			}

	else if (browserName.equalsIgnoreCase("")){
	System.setProperty("","");
	driver = new ChromeDriver();
		}
	else {
		System.out.print("Wrong browser");
	}
	driver.get(urll);
	
	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
System.out.print(driver.getTitle());
	return driver;
}}
