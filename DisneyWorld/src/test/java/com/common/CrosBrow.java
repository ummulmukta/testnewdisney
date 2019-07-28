package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrosBrow {
	WebDriver driver;
@Test
@Parameters("browser")





public void verifypagetitle(String browserName) {
	 System.out.println(browserName);
 if (browserName.equalsIgnoreCase("firefox")) {
	// System.out.println(browserName);
	System.setProperty("webdriver.gecko.driver","./Brows/geckodriver.exe");
	driver = new FirefoxDriver();	
}
 
 else if (browserName.equalsIgnoreCase("chrome")){
	 System.setProperty("webdriver.chrome.driver","./Brows/chromedriver.exe");
	 driver = new ChromeDriver();
	 }
		
		/*
		 * else if (browserName.equalsIgnoreCase("ie")) {
		 * System.setProperty("webdriver.ie.driver","./Gcko/geckodriver.exe");
		 * 
		 * driver =new EdgeDriver(); }
		 */
driver.get("https://disneyworld.disney.go.com");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
System.out.print(driver.getTitle());
//driver.quit();
}
}
