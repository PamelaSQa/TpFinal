@Smoke
Feature: Projects

  Scenario: create project successfully
    Given the user is logged in with valid email and password
    And then click on the plus icon
    And click create new project
    When enter the name for the new project
    And click on the create button
    Then the project creation is validated with the message