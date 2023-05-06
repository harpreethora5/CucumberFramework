Feature: Place an order

  Scenario: Using Default Payment option
  Given I'm a guest customer
  And My Billing Details are
  | firstname  | lastname | country            | street address    | Town/City | state    | Post Code | Email              |
  | demo       |   demo   | United States (US) | Oxford Street     | London    | Texas    |  45676    | askomdch@gmail.com |
  And I have a product in the cart
  And I'm on the checkout page
  When I provide the billing details
  And I place an order
  Then The order should be placed successfully

