package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BedAndBath extends NavigatorBar{
    private static final By MouseHoverToBedAndBath = By.xpath("//a[normalize-space()='Bed & Bath']");
    private static final By ClickOnKidsBedding= By.xpath("(//a[@aria-label='Kids Bedding'][normalize-space()='Kids Bedding'])[1]");
    private static final By KidsBedding= By.xpath("//h1[@class='hero-heading']");

    private static final Logger LOGGER = LogManager.getLogger(BedAndBath.class);

    public BedAndBath(WebDriver driver) {
        super(driver);}

    public BedAndBath mouseHoverToBedAndBathOption () {
        ActOn.element(driver, MouseHoverToBedAndBath).mouseHover();
        LOGGER.info("User mouse hover to Bed And Bath option");
        return this;
    }

    public BedAndBath clickOnKidsBeddingButton () {
        ActOn.element(driver, ClickOnKidsBedding).click();
        LOGGER.info("User clicked on Kids Bedding button");
        return this;
    }

    public BedAndBath userValidateToKidsBeddingPage () {
        LOGGER.info("User Landed to Kids Bedding page");
        boolean validateToKidsBeddingPage = driver.findElement(KidsBedding).isDisplayed();
        Assert.assertTrue("Kids Bedding page validated",validateToKidsBeddingPage);
        return this;
    }
}
