Feature: Lead Creation

  User should be able to Save a lead

  Background:
    Given Navigate to Zoho Page
    When Login to page
    And Select and create Leads

  Scenario Outline: All mandatory fields are entered
    And Enter Company as <company>
    And Enter last name  as <lastname>
    Then Save Lead

    Examples:
      | company       | lastname |
      | World Runners | Virjoen  |
      |                        | Virjoen  |
      | World Runners |             |

  Scenario Outline: All mandatory fields where Email has an "@" and a "."
    #DEFALT MANDATORY VALUES
    And Enter Company and last Name as "World Runners" and "Virjoen"
    And Enter email as <email>
    Then Save Lead

    Examples:
    |email|
    |zohoEmp@outlook.com|
    |zohoEmp@outlookcom |
    |zohoEmpoutlook.com|
    |zohoEmpoutlookcom|

  Scenario Outline: All mandatory fields where Secondary Email has an "@" and a "."
    #DEFALT MANDATORY VALUES
    And Enter Company and last Name as "World Runners" and "Virjoen"
    And Enter secondary email as <secondaryEmail>
    Then Save Lead

    Examples:
      | secondaryEmail|
      | zohoStaff@outlook.com |
      | zohoStaff@outlookcom  |
      | zohoStaffoutlook.com  |
      | zohoStaffoutlookcom   |


  Scenario Outline: All mandatory fields where Website does not have a "www" , website name, and domain extension(.com/.co.za/.ac.za/ .org)
   #DEFALT MANDATORY VALUES
    And Enter Company and last Name as "World Runners" and "Virjoen"
    And Enter website as <websiteName>
    Then Save Lead

    Examples:
      | websiteName |
      |www.ikamvayouth.org |
      |ikamvayouth.org         |
      |www.ikamvayouth      |
      |wethinkcode.co.za      |
      |google.com                |
      |tut.ac.za                    |


  Scenario Outline: All mandatory fields where No of Employees is 0
    And Enter Company and last Name as "World Runners" and "Virjoen"
    And Enter No of Employees as <NumOfEmp>
    Then Save Lead

    Examples:
      | NumOfEmp|
      | 0 |
      | 100000001   |
      | 1000000011   |

  Scenario Outline: All mandatory fields where Annual Revenue is 100000
    And Enter Company and last Name as "World Runners" and "Virjoen"
    And Enter No of Annual Revenue as <annRevenue>
    Then Save Lead

    Examples:
      | annRevenue  |
      | 100000|
      | 100 000 + 200 000|











