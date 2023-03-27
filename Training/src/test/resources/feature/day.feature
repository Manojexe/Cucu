
Feature: automating the cylos for practise

  #@tag1
  #Scenario: login in to cyclos
    #Given launch the browser
    #And visiting the login page
    #When enter username
    #And enter the password
    #And click on submit
    #Then I validate the login homepage
    #
    #@tag2
    #
    #Scenario: I visit payuser tab
    #Given launch the browser
    #
    #And visiting the login page
    #When enter username
    #And enter the password
    #And click on submit 
    #And click the payuser button
    #When enter the user name in search field 
    #And enter the user amount to be send 
    #And Write a discription amount send or not 
    #And click the next button to redirect page
    #Then verify once all details correct then click to confirm button
    #
    @tag3
    Scenario: Cyclos Login Scenario
    Given Lauch the cyclos application and Click Login
    When Enter Username "demo"
    And Enter password "1234"
    Then Click submit
@tag4
  Scenario: Purchase one product
    Given Lauch the cyclos application url and Login
    When Enter Username "demo" and Password "1234"
    And Click submit button
    Then Select Marketplace and choose the product
    And User Makes the payment
@tag5
  Scenario: Cyclos application invalid login
    Given User should launch the Cyclos Url
    And User should click the login button
    When User should enter the valid username
    And User should enter the invalid password
    Then Login with credentials and get error
    
    
    #Scenario: Adding new advertisement
    #Given launch the browser
    #And username and password and click submit
    #And enter to login page with vaild credentials
    #When navigate upload image and add advertisement 
    #Then place the advertisement to the website 
    
    #Scenario: User Launching the pet ulr and Click signIn
    #Given launch the browser
    #When enter username
    #And enter the password
    #And click on submit
    #When Search any pet in the search option
    #And Select the product and click the Add to card
    #Then Purchase the product
    
    
    #When select to my vouchers tab
    #When choose cinema voucher
    #And add three vouchers and pay amount reedem  
    #And  make the vouchers reedamble successfully
    
#Scenario Outline: verify the scheduled payments  
#Given User should lanch the url
#When User should enter the "<User>" and "<pass>"
#And User should click scheduled payments
#Examples:
#|User|pass|
#|demo|1234|
#
#Given 
    