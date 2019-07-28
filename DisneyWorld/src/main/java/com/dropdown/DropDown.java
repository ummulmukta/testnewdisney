package com.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	
	WebDriver driver;
	/*
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	Select slt = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));//Select is a class of selenium
	slt.selectByVisibleText("Baby");// i can use value & index too instead of test bt index & value is changable thats y test is depedable
	List<WebElement>option = slt.getOptions();//List is a interface if java util,WebElement is a interface of selenium i have to import both for counting the options, i use get options method from select class
	System.out.println(option.size());//how many options r there to see the console we use size 
	for(int i = 0;i<option.size();i++) {
		System.out.println(option.get(i).getText());//get(variable i) & gettext for showing the value

	}	
}
*/ 
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.quit();
	Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	//List<WebElement> selected = select.getOptions();
	//System.out.println(selected.size());
	// for loop  to get the whole list size 
	//for(int i = 0; i<selected.size();i++) {
	//System.out.println(selected.get(i).getText());
	//}
	select.selectByVisibleText("Books");
	WebElement wbe = select.getFirstSelectedOption();
	System.out.println(wbe.getText());
	
	
}
}