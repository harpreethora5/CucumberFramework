Feature: Add to Cart

  Scenario: Add one quantity from the store
    Given I am on the store page
    When I add a "Blue shoes" to the cart
    Then I should see 1 "Blue Shoes" in the cart

   
   
    
    