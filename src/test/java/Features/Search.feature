
Feature: As end user I want to search cucumber-jvm on google

  Scenario: Search cucumber-jvm on google
    Given I at google search homepage
    When I search for "cucumber-jvm" keyword
    Then I should see "cucumber-jvm" search result
    And I should see "cucumber-jvm" official homepage

