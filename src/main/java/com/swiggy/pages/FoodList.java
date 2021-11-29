package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodList {
	
	private Actions actions;
	private WebDriverWait wait;
	
	public FoodList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
	}
	
	@FindBy(xpath="(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement addButton;
	
	public void clickOnAddBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(addButton));
		addButton.click();
	}
	
	@FindBy(xpath="//div[contains(@class,'_1fmVk _30y3a')]")
	private WebElement cartIcon;
	
	public void hoverOverCartIcon()
	{
		actions.moveToElement(cartIcon).build().perform();
	}
	@FindBy(xpath="//div[contains(@class,'_55uP6')]")
	private WebElement checkOutBtn;
	
	public void clickOnCheckOutBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
		checkOutBtn.click();
	}
	
	@FindBy(xpath="//div[contains(@class,'_3coNr')]")
	private WebElement addItemBtn;
	
	public void clickOnAddItem()
	{
		wait.until(ExpectedConditions.visibilityOf(addItemBtn));
		addItemBtn.click();
	}
}
