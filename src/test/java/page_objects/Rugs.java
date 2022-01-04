package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Rugs extends NavigatorBar{
    private static final By Rugs = By.xpath("//a[normalize-space()='Rugs']");
    private static final By RugsByType = By.xpath(" //a[@aria-label='Rugs by Type']");
    private static final By FeaturedCategories = By.id("tierOneLeftNavHeader");

    private static final Logger LOGGER= LogManager.getLogger(Rugs.class);

    public Rugs (WebDriver driver) {
        super(driver);
    }



    public Rugs mouseHoverToRugsOption() {
        ActOn.element(driver,Rugs).mouseHover();
        LOGGER.info("User mouse hover to Rugs option");
        return this;
    }


    public Rugs clickOnRugsByType() {
        ActOn.element(driver,RugsByType).click();
        LOGGER.info("User clicked on Rugs By Type");
        return this;
    }

    public Rugs landedToFeaturedCategoriesPage() {
        LOGGER.info("User landed to Featured Categories page");
        boolean validateToFeaturedCategoriesPage = driver.findElement(FeaturedCategories).isDisplayed();
        Assert.assertTrue("Featured Categories page validated",validateToFeaturedCategoriesPage);
        return this;
    }


}
