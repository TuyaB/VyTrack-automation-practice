Feature: Login Feature
  Agile Story: Authorized users should be able to login

  Background: Login page
    Given User is on the login page

  Scenario: User is on the login page
    And Page Title should as expected

  Scenario: User logins as Truck Driver
    When User logins with username "user16" and password "UserUser123"
    And the Fleet Management page for Truck Driver should be displayed
    Then Fleet Management page should have following module types:
    | Fleet      |
    | Customers  |
    | Activities |
    | System     |





