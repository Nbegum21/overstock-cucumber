package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.BedAndBath;


public class BedAndBathSteps {
    private static final Logger LOGGER= LogManager.getLogger(BedAndBathSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^a user Mouse Hover To Bed and Bath option$")
    public void mouseHoverToKidsAndBath() {
       new BedAndBath(driver)
               .mouseHoverToBedAndBathOption();
        LOGGER.info("a user mouse Hover To Kids And Bath option");
    }
    @And("^click on Kids Bedding Button$")
    public void clickOnSKidsBedding() {
        new BedAndBath(driver)
                .clickOnKidsBeddingButton();
        LOGGER.info("User clicked on Shop By Room button");
    }

    @Then("^user Validate To Kids Bedding page$")
    public void validateUserKidsBeddingPage() {
    new BedAndBath(driver)
            .userValidateToKidsBeddingPage();
        LOGGER.info("User Validated To Kids Bedding page");
    }


}