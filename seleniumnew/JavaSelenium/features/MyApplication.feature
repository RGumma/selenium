Feature: Test Facebook smoke scenario

Scenario: Test login with valid credentails
Given Open firefox and start application
When I enter valid "rajinieee2006@yahoo.com" and valid "Z123Y321"
Then user should be login successfully 