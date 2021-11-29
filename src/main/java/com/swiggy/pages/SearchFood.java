package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFood {

	private WebDriverWait wait;
	
	public SearchFood(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(xpath="(//div[contains(@class,'_2CgXb')])[5]")
	private WebElement searchicon;
	public void clickOnSearchIcon()
	{
		wait.until(ExpectedConditions.visibilityOf(searchicon));
		searchicon.click();
	}
	
}

