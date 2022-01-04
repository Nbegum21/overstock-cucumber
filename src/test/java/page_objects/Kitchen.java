package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kitchen extends NavigatorBar{
    private static final By InputKitchen = By.xpath("(//a[@class='TopNav_topNavLink_13'][normalize-space()='Kitchen'])[1]");
    private static final By IndexDinnerware = By.xpath("//a[@aria-label='Dinnerware']");
    private static final By LandedDinnerware = By.xpath("//h1[@class='hero-heading']");

    private static final Logger LOGGER= LogManager.getLogger(Kitchen.class);

    public Kitchen (WebDriver driver) {
        super(driver);
    }

    public Kitchen mouseHoverToKitchenOption() {
        ActOn.element(driver,InputKitchen).mouseHover();
        LOGGER.info("User mouse hover to Kitchen option");
        return this;
    }

    public Kitchen clickOnDinnerwareButton() {
        ActOn.element(driver,IndexDinnerware).click();
        LOGGER.info("User clicked on  Dinnerware button");
        return this;
    }

    public Kitchen landedToDinnerwarePage() {
        LOGGER.info("User landed to Dinnerware  page");
        boolean validateToDinnerwarePage = driver.findElement(LandedDinnerware).isDisplayed();
        Assert.assertTrue("User validated to Dinnerware page v", validateToDinnerwarePage);
        return this;
    }



}
