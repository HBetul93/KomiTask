@US6 @singlemusic
Feature: Single Music Section

  Scenario: Clicks on the “More” button in the “Single Music” module validates and redirects
  to all relevant links.
    Given the user is on the "Single Music" module
    When the user clicks on the More button
    Then all play buttons "Spotify, Deezer, Youtube, Apple" should have relevant links


