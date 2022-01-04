package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Decor;

public class DecorSteps {

    private static final Logger LOGGER= LogManager.getLogger(DecorSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user Mouse hover to Decor option$")
    public void mouseHoverToDecorOption() {
        new Decor(driver)
                .mouseHoverToDecor();
        LOGGER.info("User mouse hover to Decor option");
    }

    @And("^Click on Mirrors Button$")
    public void clickOnMirrorsButton() {
        new Decor(driver)
                .clickOnMirrorsOption();
        LOGGER.info("User clicked on Mirrors button");
    }


    @Then("^user landed  to Mirrors page$")
    public void landedToWallMirrorsPage() {
        new Decor(driver)
                .userLandedToMirrorsPage();
        LOGGER.info("User landed to Mirrors page");

    }
}

