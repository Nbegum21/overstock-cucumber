package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomeImprove;

public class HomeImproveSteps {
    private static final Logger LOGGER= LogManager.getLogger(HomeImproveSteps.class);
    WebDriver driver = Hooks.driver;



    @When("^user Mouse hover to Home Improve option$")
    public void mouseHoverToHomeImproveOption() {
        new HomeImprove(driver)
                .mouseHoverToHomeImprove();
        LOGGER.info("User mousr hover to Home Improve option");
    }


    @And("^Click on Home EssentialsButton$")
    public void clickOnRHomeEssentialsOption() {
        new HomeImprove(driver)
                .clickOnHomeEssentialsButton();
        LOGGER.info("User clicked on Home Essentials button");
    }

    @Then("^user landed  to Housewares page$")
    public void userLandedToHousewaresPage() {
        new HomeImprove(driver)
                .landedToHousewaresPage();
        LOGGER.info("User landed to Housewares page");

    }

}
