$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/facebook1.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login Feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Successful login Scenario",
  "description": "",
  "id": "facebook-login-feature;successful-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters user \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters pass \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "facebook-login-feature;successful-login-scenario;",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ],
      "line": 9,
      "id": "facebook-login-feature;successful-login-scenario;;1"
    },
    {
      "cells": [
        "rajinieee2006@yahoo.com",
        "Z123Y321"
      ],
      "line": 10,
      "id": "facebook-login-feature;successful-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Successful login Scenario",
  "description": "",
  "id": "facebook-login-feature;successful-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters user \"rajinieee2006@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters pass \"Z123Y321\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});