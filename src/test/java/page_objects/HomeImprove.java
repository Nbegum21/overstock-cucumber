package page_objects;

import Utilities.ReadConfigFiles;
import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeImprove extends NavigatorBar{
    private static final By HomeImprove = By.xpath("//a[normalize-space()='Home Improvement']");
    private static final By HomeEssentials = By.xpath("//a[@aria-label='Home Essentials']");
    private static final By Housewares = By.xpath("//h1[@class='hero-heading']");

    private static final Logger LOGGER= LogManager.getLogger(Furniture.class);

    public HomeImprove (WebDriver driver) {
        super(driver);
    }


    public HomeImprove mouseHoverToHomeImprove() {
        ActOn.element(driver, HomeImprove).mouseHover();
        LOGGER.info("User mouse hover to Furniture option");
        return this;
    }

    public HomeImprove clickOnHomeEssentialsButton() {
        ActOn.element(driver,HomeEssentials).click();
        LOGGER.info("User clicked on House Essentials button");
        return this;
    }

    public HomeImprove landedToHousewaresPage() {
        LOGGER.info("User validate to HouseWares  page");
        boolean validateToHouseWaresPage = driver.findElement(Housewares).isDisplayed();
        Assert.assertTrue("HouseWares  page validated",validateToHouseWaresPage);
        return this;
    }

}
