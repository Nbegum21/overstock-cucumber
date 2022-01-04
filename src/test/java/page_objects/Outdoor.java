package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Outdoor extends NavigatorBar {
    private static final By Outdoor= By.xpath("//a[normalize-space()='Outdoor']");
    private static final By OutdoorDecor = By.xpath("(//a[@class='DropDown_columnLink_c4 DropDown_columnTitle_ec'][normalize-space()='Outdoor Decor'])[1]");
    private static final By LandedOutdoorDecor = By.xpath("//h1[@class='hero-heading']");


    private static final Logger LOGGER= LogManager.getLogger(Outdoor.class);

    public Outdoor (WebDriver driver) {
        super(driver);
    }

    public Outdoor mouseHoverToOutdoor() {
        ActOn.element(driver, Outdoor).mouseHover();
        LOGGER.info("User mouse hover to Outdoor option");
        return this;
    }

    public Outdoor clickOnOutdoorDecor() {
        ActOn.element(driver,OutdoorDecor).click();
        LOGGER.info("User clicked on Outdoor Decor button");
        return this;
    }

    public Outdoor userLandedToOutdoorDecorPage() {
        LOGGER.info("User landed ToOutdoor Decor  page");
        boolean validateToOutdoorDecorPage = driver.findElement(LandedOutdoorDecor).isDisplayed();
        Assert.assertTrue("User landed ToOutdoor Decor  page", validateToOutdoorDecorPage);
        return this;

    }

}
