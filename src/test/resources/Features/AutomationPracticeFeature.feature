Feature: Automation Practice Website

  @home
  Scenario: Login Functionality
    Given user open website
    When user click login menu
    And user given username and email
    And user click login button
    And user select gender
    And user set password
    And user set birth info
    And user set an option
    And user set personal info
    And user select country info
    And user set mobile number
    And user click create ac button
    And user click continue button
    Then user get assertion


  @product
  Scenario: Add to cart product
    Given user click on product menu
    When user click on view product button
    And user click on add button
    And user click continue shopping button

