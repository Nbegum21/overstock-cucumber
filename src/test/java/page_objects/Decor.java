package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Decor extends NavigatorBar {
    private static final By Decor = By.xpath("//a[normalize-space()='Decor']");
    private static final By Mirrors = By.xpath("//a[@aria-label='Mirrors']");
    private static final By LandedMirrors = By.xpath("//h1[@class='hero-heading']");


    private static final Logger LOGGER = LogManager.getLogger(Decor.class);

    public Decor (WebDriver driver) {
        super(driver);
    }


    public Decor mouseHoverToDecor() {
        ActOn.element(driver,Decor ).mouseHover();
        LOGGER.info("User mouse hover to Decor option");
        return this;
    }

    public Decor clickOnMirrorsOption() {
        ActOn.element(driver,Mirrors).click();
        LOGGER.info("User clicked on Wall Decor");
        return this;
    }

    public Decor userLandedToMirrorsPage() {
        LOGGER.info("User landed to Mirrors page");
        boolean validateToMirrorsPage = driver.findElement(LandedMirrors).isDisplayed();
        Assert.assertTrue("Mirrors page validated",validateToMirrorsPage);
        return this;
    }

}
