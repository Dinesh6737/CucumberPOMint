@tag
Feature: To validate the functionality of adactin hotel application

  @tag1
  Scenario Outline: To validate the adactin hotel application
    Given Open the browser and launch the application
    When Login using valid credentials
      | pavithran1996 | pranav@85 |
    And Search hotel by adding necessary details
      | Sydney | Hotel Creek | Double | 3 - Three | 18/12/2019 | 19/12/2019 | 2 - Two | 1 - One |
    Then Screenshot the details which we have been entered na dclick continue
    And Enter the necessary details in the displayed page "<name>""<last>""<address>""<card>""<type>""<month>""<year>""<cvv>" and click book now
    And Scroll down the displayed page and take screenshot and click my itenary and click the booked hotel in the displayed page then click cancel selected
    And click ok to the alert
    And Click logout and take screenshot ,quit the browser

    Examples: 
      | name      | last   | Address                                            | card             | type | month | year | cvv  |
      | pavithran | pranav | 2nd street,near George cottages,New Orleans,Alaska | 7843569813855767 | VISA | May   | 2022 | 9875 |
