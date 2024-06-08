Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly
    Examples:
      | word            |
      | Crowdar Academy |
      | Calidad         |
      | Software        |
      | Testing         |

#  @Smoke
#  Scenario: The client search by "Automation"
#    Given The client is on google page
#    When The client search for word Automation
#    Then The client verify that results are shown properly
#
#  @Smoke
#  Scenario: The client search by "Docker"
#    Given The client is on google page
#    When The client search for word Docker
#    Then The client verify that results are shown properly
#
#  @Smoke
#  Scenario: The client search by "Lippia"
#    Given The client isn't on google page
#    When The client search for word Lippia
#    Then The client verify that results are shown properly
