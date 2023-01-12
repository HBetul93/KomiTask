@US2 @sectionTitles
Feature: Section title scroll to correct sections

  Scenario: Click on all section titles

    When the user clicks on the "Single Music" section title
    Then the user should be on the "Single Music" module

    When the user clicks on the "Music Tracks" section title
    Then the user should be on the "Music Tracks" module

    When the user clicks on the "Pre-Save Music" section title
    Then the user should be on the "Pre-Save Music" module

    When the user clicks on the "Subscribe" section title
    Then the user should be on the "Subscribe" module