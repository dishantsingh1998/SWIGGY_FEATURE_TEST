package com.swiggy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	private Actions actions;
	
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	@FindBy(id="location")
	private WebElement locationSearchBar;
	
	public void enterLocation()
	{
		locationSearchBar.sendKeys("Delhi");
		
	}
	public void keyBoardOperation()
	{
		
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
