Feature: Place an order

  Scenario: Using Default Payment option
    Given I'm a customer
    And My Billing Details are:-
      | first_name | last_name | country_name       | street_address | town_name | state_name | Post_Code | Email_address      |
      | name       | demo      | United States (US) | Oxford Street  | London    | Texas      |     45676 | askomdch@gmail.com |
    And I have product in the cart
    And I'm on checkout page
    When I provide billing details
    And I place the order
    Then The order is placed successfully
