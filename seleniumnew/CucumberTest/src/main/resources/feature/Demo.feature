Feature: Registration form creation Feature
Scenario Outline: Successful Registration form 
Given user is on the Registration form 
When user enters name "<name>" 
And user enters phone "<phone>"
And user enters email "<email>"
And user enters country "<country>"
And user enters city "<city>"
And user enters username "<username>"
And user enters password "<password>"
Then user clicks on the submit button 

Examples: 
	| name | phone | email | country | city | username | password |
 	| ravi | 3098259364 | ravickota | United States | Irving | ravickota | Krishna |




