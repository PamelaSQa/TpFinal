@Smoke
Feature: Workspace

  Scenario: create workspace successfully
    Given the user is logged in with valid email and password
    And click on workspace
    And click manage workspaces
    And click create new workspace
    And enter a name for the workspace
    When click on the create button
    Then the new workspace is displayed in the workspace