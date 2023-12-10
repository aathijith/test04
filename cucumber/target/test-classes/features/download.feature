Feature: download testing

  @download
  Scenario: Download File Testing
    Given user goes the website to download
    And user downloads the file
    Then user validates the result