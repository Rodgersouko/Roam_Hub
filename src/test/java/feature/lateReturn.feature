@RoamHub
Feature: as a user, i should be able get battery late return count

  
  Scenario: verify user can get late returns
    Given  user has rider's inputs returnTime  and borrowTime
    When the user takes more than 5hours with the battery
    Then count late returns to be two



