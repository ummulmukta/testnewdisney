package com.mainmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil {
	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tahsinanjum123");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Tahsin25");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	
	}

}
