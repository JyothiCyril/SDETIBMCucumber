$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Devlabs/Batch 2/BroadridgeBatch2/SDETIBMCucumber/src/test/java/com/qa/Features/RediffFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Rediff application",
  "description": "",
  "id": "validate-rediff-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "Invoke the applciation",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "the user is on Rediff Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "RediffStepDefinition.the_user_is_on_Rediff_Home_page()"
});
formatter.result({
  "duration": 20619999100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login Action",
  "description": "",
  "id": "validate-rediff-application;login-action",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user click on signin link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter user name \"test@test.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter password \"mercury\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the current browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RediffStepDefinition.the_user_click_on_signin_link()"
});
formatter.result({
  "duration": 20091932600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 17
    }
  ],
  "location": "RediffStepDefinition.enter_user_name(String)"
});
formatter.result({
  "duration": 7486086800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 16
    }
  ],
  "location": "RediffStepDefinition.enter_password(String)"
});
formatter.result({
  "duration": 274213900,
  "status": "passed"
});
formatter.match({
  "location": "RediffStepDefinition.click_on_signin_button()"
});
formatter.result({
  "duration": 811755500,
  "status": "passed"
});
formatter.match({
  "location": "RediffStepDefinition.close_the_current_browser()"
});
formatter.result({
  "duration": 1906171400,
  "status": "passed"
});
});