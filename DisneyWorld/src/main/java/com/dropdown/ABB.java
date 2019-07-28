package com.dropdown;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ABB {
	@Test
	public void ad() throws Throwable {
	System.setProperty("webdriver.chrome.driver","./ADdri/ChromeDriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Actions ac=new Actions(driver);
	WebElement a=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
	//Thread.sleep(3000);
	//a.click();
	//ac.moveToElement(a).moveToElement(driver.findElement(By.linkText("Sign in"))).click().build().perform();
	//driver.quit();
	//driver.navigate().back();
	ac.moveToElement(a).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Lists')]"))).click().build().perform();
	Thread.sleep(3000);
		/*
		 * driver.findElement(By.linkText("Today's Deals")).click();
		 * driver.findElement(By.linkText("Buy Again")).click();
		 * //driver.findElement(By.linkText("Renewed Deals")).click();
		 * driver.findElement(By.linkText("")).click();
		 * 
		 * String mainw=driver.getWindowHandle();
		 * Set<String>chil=driver.getWindowHandles();
		 * Iterator<String>it=chil.iterator(); while(it.hasNext()) { String
		 * childwindow=it.next(); //driver.switchTo().window(it.next());
		 * //driver.switchTo().window(childwindow); System.out.print(driver.getTitle());
		 * driver.switchTo().window(childwindow); //driver.switchTo().window(mainw);
		 * //System.out.print(driver.getTitle()); driver.close(); }
		 * driver.switchTo().window(mainw); System.out.print(driver.getTitle());
		 * driver.quit();
		 */
}}
