Feature: Under For Corporate user will fill the form

  @sanity @regression
  Scenario: Inspecting the health and wellness form under for corporate section
    Given user clicks on the for corporate in the home page
    When user clicks the health and corporate plans
    And user fills the form
    And user clicks on schedule a demo button
    Then the user validates whether the ThankYou message is displayed or not
