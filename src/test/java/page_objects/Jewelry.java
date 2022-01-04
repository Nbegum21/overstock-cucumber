package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jewelry extends NavigatorBar{
    private static final By jewelry = By.xpath("//a[normalize-space()='Jewelry']");
    private static final By Watches = By.xpath("//a[@aria-label='Watches']");
    private static final By LandedWatchStore = By.xpath("(//h1[normalize-space()='Watch Store'])[1]");

    private static final Logger LOGGER= LogManager.getLogger(Jewelry.class);

    public Jewelry (WebDriver driver) {
        super(driver);
    }

    public Jewelry  mouseHoverToJewelry() {
        ActOn.element(driver,jewelry).mouseHover();
        LOGGER.info("User mouse hover to Jewelry option");
        return this;
    }

    public Jewelry clickOnWatchesButton() {
        ActOn.element(driver,Watches).click();
        LOGGER.info("User clicked on Watches button");
        return this;
    }
    public Jewelry userLandedToWatchStore() {
        LOGGER.info(" landed to watch store page");
        boolean validatedToWatchStorePage = driver.findElement(LandedWatchStore).isDisplayed();
        Assert.assertTrue("Watch Store page validated",validatedToWatchStorePage);
        return this;
    }

}
