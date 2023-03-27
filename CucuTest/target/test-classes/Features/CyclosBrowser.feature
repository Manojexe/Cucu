
Feature: Verifying the cyclos page

Scenario Outline: verify the cyclos in payment page

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click the submit button
And User should enter the value and click confirm button
Examples:
|User|pass|
|demo|1234|


#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payment
#Examples:
#|User|pass|
#|demo|1234|
#
#
#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payments
#Examples:
#|User|pass|
#|demo|1234|
#
#
#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payment mode
#Examples:
#|User|pass|
#|demo|1234|
#
#
#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payment modes
#Examples:
#|User|pass|
#|demo|1234|
#
#
#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click Member account
#Examples:
#|User|pass|
#|demo|1234|
#
#
#
#Scenario Outline: verify the scheduled payments
#
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click voucher
#Examples:
#|User|pass|
#|demo|1234|






