Feature: Task Creation

  User should be able to Save a Task

  Background:
    Given Navigate to Zoho Page
    When Login to page
    And Select and create Tasks

  Scenario Outline: All mandatory fields are entered
    And Enter subject as <subject>
    Then Save Lead

    Examples:
      |subject    |
      | Contact Meeting |
      |                        |

  Scenario Outline: All mandatory fields where Due date is "2024/08/18"
    And Enter default subject as "Contact Meeting"
    And Enter Due date as <dueDate>
    Then Save Task

    Examples:
      | dueDate |
      | 2024/08/18 |
      | 2010/08/18 |
      | 8/08/2024   |


  Scenario Outline: All mandatory fields where Enter Lead "Mr  Browny"
    And Enter default subject as "Contact Meeting"
    And Enter Lead as <leadName>
    Then Save Task

    Examples:
      | leadName|
      | Mr  Browny |
      | goldstainmusic22@gmail.com|

  Scenario : All mandatory fields where Set Status as "Completed"
    And Enter default subject as "Contact Meeting"
    And Enter status as "Completed"
    Then Save Task



