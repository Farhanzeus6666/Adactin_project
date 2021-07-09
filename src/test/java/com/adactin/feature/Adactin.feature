Feature: Hotel Booking Functionality

Scenario: User want to login the application
    Given User launch the adactin application
    When User enter "SowmiyaSri" as username 
    And  User enter "Sowmiya05" as password
    And user click login button
    Then User Validate the username and password
    
 Scenario: search Hotel
     When user select location
     And user select  hotel
     And user select room type
     And user select number of rooms 
     And user enter "<>" as check in date
     And user enter "<>" as check out date
     And user select adult per room
     And user select the children per room
     Then user click the search button
     
 Scenario: SELECT hotel
     When user select hotel
     Then user click the continue button
     
 Scenario: Book a hotel
     When user enter first name
     And user enter the second name
     And user enter address
     And user enter credit card number
     And user enter cardtype
     And user enter exp month 
     And user enter exp year
     And user enter the cvv number
     Then user book the hotel
     
 Scenario: logout page
     
     When user click the logout
     