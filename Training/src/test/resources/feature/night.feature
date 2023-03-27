
Feature: Verifying the cyclos page

Scenario Outline: verify the cyclos in payment page

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click the submit button
And User should enter the value and click confirm button
Examples:
|User|pass|
|demo|1234|


Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment
Examples:
|User|pass|
|demo|1234|


Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payments
Examples:
|User|pass|
|demo|1234|


Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment mode
Examples:
|User|pass|
|demo|1234|


Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment modes
Examples:
|User|pass|
|demo|1234|


Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click Member account
Examples:
|User|pass|
|demo|1234|



Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click voucher
Examples:
|User|pass|
|demo|1234|







#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
#Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
