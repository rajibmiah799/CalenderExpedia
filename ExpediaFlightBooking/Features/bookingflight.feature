Feature: flight booking by expedia
Scenario: flight booking funcanility test
Given user one expedia homepage
When user click on flight
And user click on roundtrip
And user enter flying from
And user enter destination
And user choose deperting date month
And user choose returning date month
And user click on search button
Then user get some relevent results 