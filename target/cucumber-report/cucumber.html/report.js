$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "User Checking Functionality",
  "description": "",
  "id": "user-checking-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14387193500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should sign-up page successfully",
  "description": "",
  "id": "user-checking-functionality;user-should-sign-up-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@testB"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the sign-up Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I complete personal details and click next",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I complete address details and click next",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I complete details on account section and click on create account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Account Created\" and \"Please select your Welcome Bonus\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheSignUpHomepage()"
});
formatter.result({
  "duration": 964045400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCompletePersonalDetailsAndClickNext()"
});
formatter.result({
  "duration": 5932011800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCompleteAddressDetailsAndClickNext()"
});
formatter.result({
  "duration": 46570783700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCompleteDetailsOnAccountSectionAndClickOnCreateAccount()"
});
formatter.result({
  "duration": 29637040700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Created",
      "offset": 14
    },
    {
      "val": "Please select your Welcome Bonus",
      "offset": 36
    }
  ],
  "location": "MyStepdefs.iShouldSeeAnd(String,String)"
});
formatter.result({
  "duration": 385077300,
  "status": "passed"
});
formatter.after({
  "duration": 2138841900,
  "status": "passed"
});
});