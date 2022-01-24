@wip
Feature: Vehicle Odometer Feature


  Scenario: Verify Vehicle Odometer
    Given User is on the login page
    When User logins with username "user16" and password "UserUser123"
    And user clicks on Vehicle Odometer
    Then User should see all vehicle odometer information on the grid


