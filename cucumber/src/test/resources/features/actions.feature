Feature: actions testing
  @actions @parallel1
  Scenario: Actions Drag and Drop Testing
    Given user goes the website to drag and drop
    And user drags and drops
    Then user validates result for testing