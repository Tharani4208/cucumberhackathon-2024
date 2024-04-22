Feature: Under For Corporate user will fill the form using invalid email

  @sanity @regression
  Scenario: Inspecting the health and wellness form under for corporate section with invalid email
    Given user clicks on the for corporate in the home pagee for invalid email
    When user clicks the health and corporate plans with invalid email
    And user fills the form with invalid email
    But the button is disabled