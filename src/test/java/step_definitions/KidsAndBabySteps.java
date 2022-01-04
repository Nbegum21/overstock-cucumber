package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.KidsAndBaby;

public class KidsAndBabySteps {

    private static final Logger LOGGER= LogManager.getLogger(KidsAndBabySteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user Mouse hover to Baby and Kids option$")
    public void mouseHoverToKidsAndBabyOption() {
        new KidsAndBaby(driver)
                .mouseHoverToBabyAndKids();
        LOGGER.info("User mouse hover to Rugs option");
    }

    @And("^Click on Baby Button$")
    public void clickOnBabyButton() {
        new KidsAndBaby(driver)
                .clickOnBaby();
        LOGGER.info("User clicked on Baby button");
    }

    @Then("^user landed  to Nursery Essentials page$")
    public void userLandedToNurseryEssentials() {
        new KidsAndBaby(driver)
                .userLandedToNurseryEssentials();
        LOGGER.info("User landed to Nursery Essentials page");

    }



}
