Feature: Verify the completion of the block validation screen
  @story
  Scenario:user registration
    Given the user  must be able  to register
    When  user logs
    | strUsername        | strPassword|
    |demo                | Demo       |
    And Enter block validation functionality
    And fill out block validation form
    |strRequired|strEmail     |strPassword |strConfirmPassword|strDate    |strUrl                                             |strDigitsOnly|strRange|
    |123456     |test@test.com| 123456789  |123456789         |22/03/2022 |https://www.youtube.com/watch?v=Ea-h0OTz-r4        |9876543      |14      |
    Then user must be able to click the validate button





