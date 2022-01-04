package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Jewelry;

public class JewelrySteps {
    private static final Logger LOGGER= LogManager.getLogger(JewelrySteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user Mouse hover to Jewelry option$")
    public void mouseHoverToJewelryOption() {
        new Jewelry(driver)
                .mouseHoverToJewelry();
        LOGGER.info("User mouse hover to Jewelry option");
    }

    @And("^Click on Watches Button")
    public void clickOnWatches() {
        new Jewelry(driver)
                .clickOnWatchesButton();
        LOGGER.info("User clicked on Watches Button");
    }

    @Then("^user landed  to Watch Store page$")
    public void userLandedToWatchStore() {
        new Jewelry(driver)
                .userLandedToWatchStore();
        LOGGER.info("User landed to Watch Store page");

    }


}
