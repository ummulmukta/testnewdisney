package com.mainmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mainmm {
	public static void main(String[] args){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
	Actions ac = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']"));
	//Thread.sleep(5000);
	ac.moveToElement(we).moveToElement(driver.findElement(By.xpath("(//span[@class='nav-text'])[1]"))).click().build().perform();
	

		/*
		 * driver.findElement(By.xpath("//input[@name='submit']")).click(); Alert alert=
		 * driver.switchTo().alert(); String alrtMsg=
		 * driver.switchTo().alert().getText(); alert.accept();
		 * System.out.println(alrtMsg);
		 */
	
	//driver.navigate().back();
	//driver.navigate().forward();
	}

}
