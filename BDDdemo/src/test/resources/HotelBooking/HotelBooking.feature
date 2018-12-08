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
@tag
Feature: Booking Hotel
 
Scenario:  User is entering all details in booking page
Given user is in booking page
And user is logged in
When user gives all valid data
Then navigate to success page

Scenario: user not entering firstname and leaving it blank
Given user is on form page
And user id logged in
When user does not enter firstname
Then prompt an error message 

Scenario: user not entering lastname
Given user is on form page
And user is logged in
When user leaves the field as blank 
And click submit
Then prompt a error message

Scenario: user entering email id to the form
Given user is on form page
And user is logged in
When user enter the email id
But user enter invalid email id
Then prompt a error message

Scenario: user not entering or entering invalid mobile number
Given user is on form page
And user is logged
When user does not enter the valid mobile number
|5246986565|
|985623|
|998822116655|
| |
|0008642544|
Then prompt a error message

Scenario: user not entering city 
Given user is on form page
Then prompt a error message

Scenario: user not entering state
Given user is on form page
Then prompt a error message

Scenario: user not entering number of guest
Given user is on form page
Then prompt a error message

Scenario: user not entering payment details
Given user is on form page
Then prompt a error message
