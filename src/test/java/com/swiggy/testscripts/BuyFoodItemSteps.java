package com.swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFoodItemSteps extends Driver {

	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		// Verifying the user is at landing page
		Assert.assertTrue(driver.getTitle()
				.equals("Order food online from India's best food delivery service. Order from restaurants near you"));

	}

	@When("he enters location as Delhi in the search bar")
	public void he_enters_location_as_delhi_in_the_search_bar() throws InterruptedException {

		// he enters location as pune in the location searchbar
		landingPage.enterLocation();
		Thread.sleep(4000);
	}

	@When("he press the down-arrow key then hit the enter button")
	public void he_press_the_down_arrow_key_then_hit_the_enter_button() {
		// he select the dirst option from the auto-complete box
		landingPage.keyBoardOperation();

	}

	@When("he clicks on the search icon")
	public void he_clicks_on_the_search_icon() {
		// he clicks on the search icon to enter food name
		searchFood.clickOnSearchIcon();

	}

	@When("he enter food item name in the searchbox as {string}")
	public void he_enter_food_item_name_in_the_searchbox_as(String string) {
		// he enters the food name in the search-bar
		enterFood.enterFoodName(string);
	}

	@When("he select the first item in the auto complete box")
	public void he_select_the_first_item_in_the_auto_complete_box() throws InterruptedException {
		// he select the first food item from the auto complete box
		Thread.sleep(4000);
		enterFood.keyBoardOperation1();
	}

	@When("he click on the add button to add the first item")
	public void he_click_on_the_add_button_to_add_the_first_item() {
		// he clicks on the add button to add the item into the cart
		foodList.clickOnAddBtn();
	}

	@When("he click on the add item button from the popup")
	public void he_click_on_the_add_item_button_from_the_popup() {
		// click on add Item on the popup
		foodList.clickOnAddItem();
	}

	@When("he hovers on the cart icon")
	public void he_hovers_on_the_cart_icon() throws InterruptedException {
		// he hovers over the cart icon
		Thread.sleep(4000);
		foodList.hoverOverCartIcon();
	}

	@When("he click on the checkout button")
	public void he_click_on_the_checkout_button() {
		// he clicks on the checkout button
		foodList.clickOnCheckOutBtn();
	}

	@Then("he able to buy the food item successfully")
	public void he_able_to_buy_the_food_item_successfully() {
		String expText = "SECURE CHECKOUT";
		String actText = buyFood.getTheText();
		Assert.assertEquals(actText, expText);
	}
}