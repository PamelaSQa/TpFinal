@Smoke
Feature: Timetracker

  Scenario Outline: Add hours in a project
    Given the user is logged in with valid email and password
    When enter start time <start-time>
    And enter time <end-time>
    And enter date <date>
    And click on ADD button
    Then new time is added to list of this week
    Examples:
      | start-time | end-time | date       |
      | 09:00      | 11:00    | 08/06/2024 |
      | 09:30      | 18:30    | 25/06/2024 |


  Scenario: Cancel add hours in a project
    Given the user is logged in with valid email and password
    When click on timer icon for change mode
    And click on START button
    And click on icon options
    And click on Discard
    And click on DISCARD for confirmation
    Then time is not add to list


  Scenario Outline: Modify existing entry
    Given the user is logged in with valid email and password
    When modify the entry already existent description <description>, start time <start-time>, end time <end-time>
    And modify project
    Then The data is modified by viewing the confirmation
    Examples:
      | description | start-time | end-time |
      | Modificando | 15:00      | 15:30    |


