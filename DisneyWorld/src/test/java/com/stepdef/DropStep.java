package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import com.common.NewBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DropStep extends NewBase {
	
	@When("^user able to click all button$")
	//@Parameters(Browsser)
	public void user_able_to_click_all_button() throws Throwable {
		driver=getDriver("browserName");
	    Select select =new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	    select.selectByVisibleText("Baby");
	    WebElement we = select.getFirstSelectedOption();
		System.out.println(we);
	}

	@When("^user able to go baby page$")
	public void user_able_to_go_baby_page() throws Throwable {
	    
	}

	@Then("^successfully go baby link$")
	public void successfully_go_baby_link() throws Throwable {
	    
	}


	

}
