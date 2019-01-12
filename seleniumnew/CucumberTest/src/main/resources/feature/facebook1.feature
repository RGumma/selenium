Feature: Facebook login Feature
Scenario Outline: Successful login Scenario
Given user is on the login page 
When user enters user "<user>"
And user enters pass "<pass>"
Then login should be successful

Examples:
| user | pass |
| rajinieee2006@yahoo.com | Z123Y321|

