Feature: Thumbnails

  Scenario: US1-User checks if all the thumbnail images are loaded and visible

    When user on the profile page
    Then validate the thumbnails are loaded and visible