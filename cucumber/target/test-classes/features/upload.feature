Feature: upload testing

  @upload @parallel2
  Scenario: Upload File Testing
    Given user goes the website to upload
    And user uploads the file
    Then user validates result