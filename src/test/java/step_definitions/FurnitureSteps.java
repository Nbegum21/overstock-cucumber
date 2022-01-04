package step_definitions;

import Utilities.ReadConfigFiles;
import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.Furniture;


public class FurnitureSteps {
    private static final By EnableDiscountAndShoppingAlert = By.id("notification_deny");

    private static final Logger LOGGER= LogManager.getLogger(FurnitureSteps.class);
    WebDriver driver = Hooks.driver;

  @Given("a user is on the Home Pge")
    public void navigateToLHomePage() {
      String url = ReadConfigFiles.getPropertyValues("OverstockAppUrl");
      ActOn.browser(driver).openBrowser(url);
      LOGGER.info("a user is on the Home page");
    }

 @And("click on No Thanks")
    public void clickOnNoThanks() {
     ActOn.element(driver,EnableDiscountAndShoppingAlert).click();
     LOGGER.info("User clicked on No Thanks button");
  }

    @When("^user Mouse hover to Furniture option$")
    public void mouseHoverToFurnitureOption() {
        new Furniture(driver)
                .mouseHoverToFurniture();
        LOGGER.info("User mouse hover to Furniture option");
    }

    @And("^click on Tv Stands$")
    public void clickOnTvStands() {
        new Furniture(driver)
                .clickOnTvStands();
        LOGGER.info("User clicked on Tv Stand button");
    }

    @Then("^user landed  to Tv Stands and Entertainment Centre  page$")
    public void userLandedToTvStandAndEntertainmentCentre() {
        new Furniture(driver)
                .validateToTvStandAndEntertainmentCentre();
        LOGGER.info("User landed to Tv Stand and Entertainment Centre page");
    }
}