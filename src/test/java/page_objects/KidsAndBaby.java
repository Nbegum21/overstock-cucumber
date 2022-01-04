package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KidsAndBaby extends NavigatorBar{
    private static final By BabyAndKids = By.xpath("//a[normalize-space()='Kids & Baby']");
    private static final By Baby = By.xpath("//a[@aria-label='Baby']");
    private static final By NurseryEssentials = By.xpath("//h2[normalize-space()='Nursery Essentials']");

    private static final Logger LOGGER = LogManager.getLogger(KidsAndBaby.class);

    public KidsAndBaby(WebDriver driver) {
        super(driver);
    }




    public KidsAndBaby mouseHoverToBabyAndKids() {
        ActOn.element(driver,BabyAndKids ).mouseHover();
        LOGGER.info("User mouse hover to Baby&Kids option");
        return this;
    }

    public KidsAndBaby clickOnBaby() {
        ActOn.element(driver,Baby).click();
        LOGGER.info("User clicked on Baby");
        return this;
    }

    public KidsAndBaby userLandedToNurseryEssentials() {
        LOGGER.info("Nursery Essentials page Validated");
        boolean validateToNurseryEssentialsPage = driver.findElement(NurseryEssentials).isDisplayed();
        Assert.assertTrue("Nursery Essentials page Validated",validateToNurseryEssentialsPage);
        return this;
    }

}
