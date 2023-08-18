Feature: Title of your feature

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Launch the URL
    When Enter user "<username>"
    And Enter pass "<pass>"
    Then Validate the "<status>"

    Examples: 
      | username  | pass | status  |
      | name1 | Aert | success |
      | name2 | Aii  | Fail    |
