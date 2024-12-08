@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @regression @smoke
  Scenario: Title of your scenario
    Given I want precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @regression
  Scenario Outline: Title of your scenario outline
    Given I have a data table with the following values
     | Name  | Age | Occupation |
      | John  | 30  | Developer  |
      | Jane  | 25  | Tester      |
      | Bob   | 40  | Manager     |
    When I perform some action
    Then I should see the result