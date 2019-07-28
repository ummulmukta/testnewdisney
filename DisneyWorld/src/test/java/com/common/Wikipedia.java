package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Wikipedia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Brows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
	String title=driver.getTitle();
	System.out.println(title);
		Assert.assertEquals(title,"Wikipedia");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//List<WebElement>t=driver.findElements(By.tagName("a"));
		//System.out.print(t.size());
		WebElement a=driver.findElement(By.xpath("//div[@class='central-featured']"));
		List<WebElement>v=driver.findElements(By.tagName("a"));
		System.out.print(v.size());
		/*List<WebElement>b=driver.findElements(By.xpath("//div[@class='central-featured']"));
		System.out.print(b.size());
		for(WebElement ad:b) {
			
			//System.out.print(ad.isDisplayed());
			
			  if(ad.isDisplayed()) 
			  { 
				  System.out.print(ad.getText());
				 // System.out.print(b.size());
			  }
			 
		}
		
		WebElement search=driver.findElement(By.xpath("//input[@id='searchInput']"));
		search.sendKeys("Test");
		search.sendKeys(Keys.RETURN);
		//driver.switchTo().window();
		String newtitle =driver.getCurrentUrl();
		
	
	System.out.print(newtitle);
		Assert.assertEquals(newtitle,"https://en.wikipedia.org/wiki/Test10");
		
		
		
		
		
		
		}*/
	}}


