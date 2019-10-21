$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Login.feature");
formatter.feature({
  "name": "Customer Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logo presence on customer home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "I lunch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GivenSteps.i_lunch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open facebook login page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDefinition.i_open_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify that logo present on page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.i_Verify_that_logo_present_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});