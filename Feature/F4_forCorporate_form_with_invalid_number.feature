Feature: Under For Corporate user will fill the form using invalid number

  @sanity @regression
  Scenario: Inspecting the health and wellness form under for corporate section with invalid details
    Given user clicks on the for corporate in the home pagee for invalid number
    When user clicks the health and corporate plans with invalid number
    And user fills the form with invalid number
    But the button is disabled when invalid number is given