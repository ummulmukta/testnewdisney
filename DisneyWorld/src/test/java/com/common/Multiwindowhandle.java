package com.common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Brows/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); driver.get("https://www.amazon.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
String parentt=driver.getWindowHandle();
Set<String> child=driver.getWindowHandles();
for(String destinwin:child) {
	
	if(!destinwin.equals(parentt)) {
		driver.switchTo().window(destinwin);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(driver.getTitle());
		driver.close();
	}
}
driver.switchTo().window(parentt);
//System.out.print(driver.getCurrentUrl());
	}

}
