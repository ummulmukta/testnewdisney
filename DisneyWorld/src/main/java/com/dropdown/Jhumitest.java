package com.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jhumitest {
public void parent() {
System.setProperty("webdriver.chrome.driver","./ADdri/ChromeDriver/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

}



}
