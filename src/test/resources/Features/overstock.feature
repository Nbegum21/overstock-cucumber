@test_overstock
Feature: overstock Test Functionalities

Background:
  Given a user is on the Home Pge
  And click on No Thanks

  @Furniture
  Scenario: overstock Furniture test page
  When user Mouse hover to Furniture option
  And click on Tv Stands
  Then user landed  to Tv Stands and Entertainment Centre  page

  @Rugs
  Scenario:  overstock Rugs test page
    When user Mouse hover to Rugs option
    And Click on Rugs By Type
    Then user landed  to Featured Categories page

  @Decor
  Scenario:  overstock Decor test page
    When user Mouse hover to Decor option
    And Click on Mirrors Button
    Then user landed  to Mirrors page

  @Test_BedAndBath
  Scenario:  overstock Bed And Bath test page
    When a user Mouse Hover To Bed and Bath option
    And   click on Kids Bedding Button
    Then user Validate To Kids Bedding page

  @HomeImprove
  Scenario:  overstock Home Improve  test page
    When user Mouse hover to Home Improve option
    And Click on Home EssentialsButton
    Then user landed  to Housewares page

  @Test_Kitchen
  Scenario:  overstock kitchen test page
    When user Mouse hover to Kitchen option
    And Click on Dinnerware option
    Then user landed  to Dinnerware page

  @Test_Outdoor
  Scenario:  overstock Outdoor test page
    When user Mouse hover to Outdoor option
    And Click on Outdoor Decor option
    Then user landed  to Outdoor Decor page

  @Test_Jewelry
  Scenario:  overstock Jewelry test page
    When user Mouse hover to Jewelry option
    And Click on Watches Button
    Then user landed  to Watch Store page

  @Test_Lighting
  Scenario:  overstock Lighting test page
    When user Mouse hover to Lighting option
    And Click on Wall lighting option
    Then user landed  to Shop Wall Lighting page

  @Test_Baby&Kids
  Scenario:  overstock Baby and Kids test page
    When user Mouse hover to Baby and Kids option
    And Click on Baby Button
    Then user landed  to Nursery Essentials page











