Feature: searching products

  Scenario Outline: searching products on google
    Given i am on the google homepage
    When i enter the "<product_name>"
    And i click on the search button
    Then i see the related search results successfully

    Examples: 
      | product_name |
      | Football     |
      | Computer     |
      | Toys         |
