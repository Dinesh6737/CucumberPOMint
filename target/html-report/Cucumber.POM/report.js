$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sample.feature");
formatter.feature({
  "name": "To validate the functionality of adactin hotel application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the adactin hotel application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "name": "Login using valid credentials",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "pavithran1996",
        "pranav@85"
      ]
    }
  ]
});
formatter.step({
  "name": "Search hotel by adding necessary details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Double",
        "3 - Three",
        "18/12/2019",
        "19/12/2019",
        "2 - Two",
        "1 - One"
      ]
    }
  ]
});
formatter.step({
  "name": "Screenshot the details which we have been entered na dclick continue",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter the necessary details in the displayed page \"\u003cname\u003e\"\"\u003clast\u003e\"\"\u003caddress\u003e\"\"\u003ccard\u003e\"\"\u003ctype\u003e\"\"\u003cmonth\u003e\"\"\u003cyear\u003e\"\"\u003ccvv\u003e\" and click book now",
  "keyword": "And "
});
formatter.step({
  "name": "Scroll down the displayed page and take screenshot and click my itenary and click the booked hotel in the displayed page then click cancel selected",
  "keyword": "And "
});
formatter.step({
  "name": "click ok to the alert",
  "keyword": "And "
});
formatter.step({
  "name": "Click logout and take screenshot ,quit the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "last",
        "Address",
        "card",
        "type",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "pavithran",
        "pranav",
        "2nd street,near George cottages,New Orleans,Alaska",
        "7843569813855767",
        "VISA",
        "May",
        "2022",
        "9875"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the adactin hotel application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefeniton.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login using valid credentials",
  "rows": [
    {
      "cells": [
        "pavithran1996",
        "pranav@85"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefeniton.login_using_valid_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search hotel by adding necessary details",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Double",
        "3 - Three",
        "18/12/2019",
        "19/12/2019",
        "2 - Two",
        "1 - One"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefeniton.search_hotel_by_adding_necessary_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Screenshot the details which we have been entered na dclick continue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefeniton.screenshot_the_details_which_we_have_been_entered_na_dclick_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the necessary details in the displayed page \"pavithran\"\"pranav\"\"\u003caddress\u003e\"\"7843569813855767\"\"VISA\"\"May\"\"2022\"\"9875\" and click book now",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefeniton.enter_the_necessary_details_in_the_displayed_page_and_click_book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll down the displayed page and take screenshot and click my itenary and click the booked hotel in the displayed page then click cancel selected",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefeniton.scroll_down_the_displayed_page_and_take_screenshot_and_click_my_itenary_and_click_the_booked_hotel_in_the_displayed_page_then_click_cancel_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click ok to the alert",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefeniton.click_ok_to_the_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click logout and take screenshot ,quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefeniton.click_logout_and_take_screenshot_quit_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});