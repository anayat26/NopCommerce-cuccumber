$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Common steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/SearchCusto.feature");
formatter.feature({
  "name": "Search Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Common Steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer by emailID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SearchCustByEmailID"
    }
  ]
});
formatter.step({
  "name": "enter Email ID",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_Email_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search Btn",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_search_Btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});