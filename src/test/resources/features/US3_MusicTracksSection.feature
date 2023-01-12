@US3
Feature: Music Tracks Section

  Scenario: User clicks on the side navigation arrow and validates the paging and data.
    Given the user is on the "Music Tracks" module
    When the user clicks on "Music Tracks" module's side navigation arrow multiple times
    Then user should see all module tracks
