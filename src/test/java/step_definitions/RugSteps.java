package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Rugs;

public class RugSteps {
    private static final Logger LOGGER= LogManager.getLogger(RugSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user Mouse hover to Rugs option$")
    public void mouseHoverToRugs() {
        new Rugs(driver)
                .mouseHoverToRugsOption();
        LOGGER.info("User mouse hover to Rugs option");
    }

    @And("^Click on Rugs By Type$")
    public void clickOnRugsByType() {
        new Rugs(driver)
                .clickOnRugsByType();
        LOGGER.info("User clicked on Tv Stand button");
    }

    @Then("^user landed  to Featured Categories page$")
    public void userLandedToFeaturedCategories() {
        new Rugs(driver)
                .landedToFeaturedCategoriesPage();
        LOGGER.info("User landed to Featured Categories page");

    }
}
