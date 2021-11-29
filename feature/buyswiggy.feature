Feature: A User will pizza in swiggy

@TC101 @regression @pizza
Scenario: Buy food item
Given a user is on the landing page of Swiggy
When he enters location as Delhi in the search bar
And he press the down-arrow key then hit the enter button
And he clicks on the search icon
And he enter food item name in the searchbox as "<fooditem>"
And he select the first item in the auto complete box
And he click on the add button to add the first item
And he click on the add item button from the popup
And he hovers on the cart icon
And he click on the checkout button
Then he able to buy the food item successfully

Examples:
|fooditem|
|pizza|
