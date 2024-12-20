#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@loginCustomer
Feature: Login as Customer
  As a customer 
  I want to login
  So I can see my account 
  

  @LogCust
  Scenario Outline: Login Customer
    Given I open the website XYZ Bank
    When I click button customer login
    And I click button drop down
    And I click <username>
    And I click button login
    Then I see <account>

    Examples: 
      | username  | account | 
      | Hermoine Grager | Hermoine Grager | 
      | Harry Potter | Harry Potter |
      #| Ron Weasly | Ron Weasly | 
      #| Aldus Dumbleoder | Aldus Dumbleoder |
      #| Neville Longbottom | Neville Longbottom | 
      #| Abi Bika | Abi Bika | 