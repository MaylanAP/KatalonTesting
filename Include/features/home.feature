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
@home
Feature: Login sebagai customer
  As a customer
  I want to login
  So I click button Customer Login

  @CustLog
  Scenario: click button customer login
    Given I open the website XYZ Bank
    When I click button customer login
    Then I see login page customer
    
  @ManagerLog
  Scenario: click button Bank Manager Login
  	Given I open the website XYZ Bank
  	When I click button bank manager login
  	Then I see login page manager