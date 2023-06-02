Feature: I want to do a flow complete into the store suace demo page

  @SuccessfulFlowStorePage
  Scenario: Successful flow into the store: selecting products, organizing and validate prices
    Given user log in to the store page
    When sort the products from lowest to highest value, Add to cart the product with the lowest to the highest price, and another product with any price
    And Go to the car and remove one of the products
    And do the checkout, enter all the data, continue and validate that the totalItems is correct
    And validate that the total sum of totalItems + tax is correct.
    Then validate final message when buying

  @FailedPurchaseCauseProblemUser
  Scenario: User try to log in with access lock
    Given user log in to the store page sauce
    When try to access with lock credentials
    Then user should an error message in checkout

  @BugPurchaseWithoutArticle
  Scenario: User Buy without article selected
    Given user log in to the store page
    When no selected article and continue to the final flow
    Then no should see positive message like a succesful purchase