@singlemusic
Feature:Single Music Section

  Scenario Outline: US6-Clicks on the “More” button in the “Single Music” module validates and redirects
  to all relevant links.

    Given the user on the Single Music module
    When the user clicks on the More button
    Then clicks on play button beside the "<icon>" <index> navigate to "<pageLink>" successfully

    Examples: links data
      | icon         | pageLink                     | index |
      | Spotify      | https://open.spotify.com/    | 0     |
      | AppleMusic   | https://music.apple.com/     | 1     |
      | YouTubeMusic | https://consent.youtube.com/ | 2     |
      | Deezer       | https://www.deezer.com/en    | 3     |

  Scenario: all in one
    When the user clicks on the More button
    Then the user click on all play buttons "Spotify, Deezer, Youtube, Apple"


