@preSave
Feature: Pre-Save Button

Scenario Outline: US4-User clicks on “Pre-Save” button and validates the button changes to “Pre-saved”
When the user clicks on the Music Tracks module
Then chooses a "<song>" by clicking play and clicks on Pre-Save button
And validate the Pre-Save button changed to Pre-Saved

Examples: test data
| song        |
| first song  |
| second song |
| third song  |