Feature: This features tests Youtube

  Scenario: Check_videos_are_displayed
    When Navigated to youtube
    Then Validate youtube logo is displayed
    And Search for video
