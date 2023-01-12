@US1 @thumbnails
Feature: Thumbnails

  Scenario: User checks if all the thumbnail images are loaded and visible
    When the user goes to profile page
    Then validate the thumbnails are loaded and visible