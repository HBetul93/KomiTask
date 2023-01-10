@sectionTitles
Feature: Section Titles

  Scenario: US2-Clicking on the section title at the top takes you to the right module

    When the user clicks on the Single Music section
    Then the user should be on the Single Music module
    When the user clicks on the Music Tracks section
    Then the user on the Music Tracks module
    When the user clicks on the Pre-Save Music section
    Then the user should be on the Pre-Save Music module
    When the user clicks on the Subscribe section
    Then the user should be on the Subscribe module
