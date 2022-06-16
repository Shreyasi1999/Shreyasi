$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Sample.feature");
formatter.feature({
  "name": "feature to test opening the browser functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of the URL",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.Sample.open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"https://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.Sample.enter_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.Sample.page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});