package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Lighting;

public class LightingSteps {
    private static final Logger LOGGER= LogManager.getLogger(Lighting.class);
    WebDriver driver = Hooks.driver;


    @When("^user Mouse hover to Lighting option$")
    public void mouseHoverToLightingOption() {
        new Lighting(driver)
                .mouseHoverToLighting();
        LOGGER.info("User mouse hover to Lighting option");
    }

    @And("^Click on Wall lighting option$")
    public void clickOnWallLighting() {
        new Lighting(driver)
                .clickOnTWallLighting();
        LOGGER.info("User clicked on Wall Lighting option");
    }

    @Then("^user landed  to Shop Wall Lighting page$")
    public void userValidateToShopWallLighting() {
        new Lighting(driver)
                .landedToShopWallLightingPage();
        LOGGER.info("User landed to  Shop Wall Lighting page");
    }


}


