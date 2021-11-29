package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyFood {

	private WebDriverWait wait;
	
	public BuyFood(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(xpath="//div[contains(@class,'B5DgV')]")
	private WebElement text;
	
	public String getTheText()
	{
		wait.until(ExpectedConditions.visibilityOf(text));
		String Lasttext= text.getText();
		return Lasttext;
	}
	
}
