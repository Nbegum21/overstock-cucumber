package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Outdoor;

public class OutdoorSteps {

    private static final Logger LOGGER = LogManager.getLogger(OutdoorSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user Mouse hover to Outdoor option$")
    public void mouseHoverToOutdoor() {
        new Outdoor(driver)
                .mouseHoverToOutdoor();
        LOGGER.info("User mouse hover to Kitchen option");
    }

    @And("^Click on Outdoor Decor option$")
    public void clickOnOutdoorDecor() {
        new Outdoor(driver)
                .clickOnOutdoorDecor();
        LOGGER.info("Click on Outdoor Decor option");
    }

    @Then("^user landed  to Outdoor Decor page$")
    public void userLandedToOutdoorDecor() {
        new Outdoor(driver)
                .userLandedToOutdoorDecorPage();
        LOGGER.info("User landed to Outdoor Decor page");
    }
}
