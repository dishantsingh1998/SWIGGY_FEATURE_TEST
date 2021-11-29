package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import com.swiggy.pages.BuyFood;
import com.swiggy.pages.EnterFood;
import com.swiggy.pages.FoodList;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.SearchFood;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static SearchFood searchFood;
	protected static EnterFood enterFood;
	protected static FoodList foodList;
	protected static BuyFood buyFood;
	
	public static void init()
	{
		System.setProperty("webdriver.chrome.driver",     "chromedriver.exe");
		driver= new ChromeDriver();
		landingPage=new LandingPage(driver);
		searchFood=new SearchFood(driver);
		enterFood=new EnterFood(driver);
		foodList=new FoodList(driver);
		buyFood=new BuyFood(driver);
	}
}
