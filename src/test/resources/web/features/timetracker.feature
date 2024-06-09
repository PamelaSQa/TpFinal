Feature: Timetracker

  Scenario Outline: Add hours in a project
    Given the client is on the login page https://app.clockify.me/en/login
    When click on Log in manually
    And enter <email> and password <pass>
    And click on LOG IN button
    And enter start time <start-time> , send time <end-time>
    And enter date <date>
    And click on ADD button
    Then new time is added to list of this week
    Examples:
      | email                    | pass        | start-time | end-time | date       |
      | pamela.s.qa@gmail.com    | pruebas2024 | 09:00      | 11:00    | 08/06/2024 |
      | pamela.s.qa@gmail.com:30 | pruebas2024 | 18:30      | 12:30    | 08/06/2024 |


  Scenario Outline: Cancel add hours in a project
    Given the client is on the login page https://app.clockify.me/en/login
    When click on Log in manually
    And enter <email> and password <pass>
    And click on LOG IN button
    And click on timer icon for change mode
    And click on START button
    And click on icon options
    And click on Discard
    And click on DISCARD for confirmation
    Then time is not add to list
    Examples:
      | email                 | pass        |
      | pamela.s.qa@gmail.com | pruebas2024 |

  Scenario Outline: Modify existing entry
    Given the client is on the login page https://app.clockify.me/en/login
    When click on Log in manually
    And enter <email> and password <pass>
    And click on LOG IN button
    And modify the entry already existent  name <name> , project <project>, start time <start-time>, end time <end-time>
    And select date on calendar
    Then The data is modified by viewing the confirmation
    Examples:
      | email                 | pass        | name       | project    | start-time | end-time |
      | pamela.s.qa@gmail.com | pruebas2024 | Modificar1 | No project | 15:00      | 15:30    |

