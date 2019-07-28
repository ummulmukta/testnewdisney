package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testt {
	
	@Test
public void parentt() {
	System.setProperty("webdriver.chrome.driver","./ADdri/ChromeDriver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
}
}
