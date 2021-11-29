package com.swiggy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterFood {
	
	private Actions actions;
	private WebDriverWait wait;
	
	public EnterFood(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(xpath="//input[contains(@class,'_2BJMh')]")
	private WebElement foodSearchBar;
	
	public void enterFoodName(String food)
	{
		wait.until(ExpectedConditions.visibilityOf(foodSearchBar));
		foodSearchBar.clear();
		foodSearchBar.sendKeys(food);
	}
	public void keyBoardOperation1()
	{
		//wait.until(ExpectedConditions.visibilityOf(foodSearchBar));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
