package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lighting extends NavigatorBar{
    private static final By Lighting = By.xpath("//a[normalize-space()='Lighting']");
    private static final By WallLighting = By.xpath("//a[@aria-label='Wall Lighting']");
    private static final By LandedShopWallLights = By.xpath("//h2[normalize-space()='Shop Wall Lights']");

    private static final Logger LOGGER= LogManager.getLogger(Lighting.class);

    public Lighting (WebDriver driver) {

        super(driver);
    }

    public Lighting mouseHoverToLighting() {
        ActOn.element(driver, Lighting).mouseHover();
        LOGGER.info("User mouse hover to Lighting option");
        return this;
    }

    public Lighting clickOnTWallLighting() {
        ActOn.element(driver,WallLighting).click();
        LOGGER.info("User clicked on Wall Lighting button");
        return this;
    }

    public Lighting  landedToShopWallLightingPage() {
        LOGGER.info("User landed to Shop Wall Lights  page");
        boolean validateShopWallLightPage = driver.findElement(LandedShopWallLights).isDisplayed();
        Assert.assertTrue("Shop Wall Lights page validated", validateShopWallLightPage);
        return this;
    }
}
