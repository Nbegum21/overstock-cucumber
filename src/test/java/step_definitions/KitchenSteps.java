package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Kitchen;

public class KitchenSteps {

    private static final Logger LOGGER= LogManager.getLogger(KitchenSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user Mouse hover to Kitchen option$")
    public void mouseHoverToKitchen() {
        new Kitchen(driver)
                .mouseHoverToKitchenOption();
        LOGGER.info("User mouse hover to Kitchen option");
    }

    @And("^Click on Dinnerware option$")
    public void clickOnDinnerware() {
        new Kitchen(driver)
                .clickOnDinnerwareButton();
        LOGGER.info("User clicked on Dinnerware option");
    }

    @Then("^user landed  to Dinnerware page$")
    public void userLandedToDinnerwarePage() {
        new Kitchen(driver)
                .landedToDinnerwarePage();
        LOGGER.info("User landed to Dinnerware page");

    }


}
