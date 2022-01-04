package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Furniture extends NavigatorBar {
    private static final By Furniture = By.xpath("//*[@id='TopNav']/div[1]/div[1]/a");
    private static final By TvStands = By.xpath("//a[@aria-label='TV Stands']");
    private static final By TvStandEntertainmentCentre = By.xpath("(//h1[normalize-space()='TV Stands & Entertainment Centers'])[1]");


    private static final Logger LOGGER = LogManager.getLogger(Furniture.class);

    public Furniture(WebDriver driver) {

        super(driver);}

     public Furniture mouseHoverToFurniture () {
            ActOn.element(driver, Furniture).mouseHover();
            LOGGER.info("User mouse hover to Furniture option");
            return this;
        }

        public Furniture clickOnTvStands () {
            ActOn.element(driver, TvStands).click();
            LOGGER.info("User clicked on Tv Stand button");
            return this;
        }

        public Furniture validateToTvStandAndEntertainmentCentre () {
            LOGGER.info("User Tv Stands and Entertainment Centre  page");
            boolean checkTvStandAndEntertainmentCentre = driver.findElement(TvStandEntertainmentCentre).isDisplayed();
            Assert.assertTrue("Tv Stand and Entertainment centre page validated", checkTvStandAndEntertainmentCentre);
            return this;
        }

    }
