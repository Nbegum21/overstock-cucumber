package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigatorBar {
    private final By Furniture =  By.xpath("//*[@id='TopNav']/div[1]/div[1]/a");
    private final By Rugs =  By.xpath("//a[normalize-space()='Rugs']");
    private final By Decor = By.xpath("//a[normalize-space()='Decor']");
    private static final By MouseHoverToBedAndBath = By.xpath("//a[normalize-space()='Bed & Bath']");
    private static final By HomeImprove = By.xpath("//a[normalize-space()='Home Improvement']");
     private static final By Kitchen = By.xpath("(//a[@class='TopNav_topNavLink_13'][normalize-space()='Kitchen'])[1]");
    private static final By Outdoor= By.xpath("//a[normalize-space()='Outdoor']");
    private static final By jewelry = By.xpath("//a[normalize-space()='Jewelry']");
    private static final By Lighting = By.xpath("//a[normalize-space()='Lighting']");
    private static final By BabyAndKids = By.xpath("//a[normalize-space()='Kids & Baby']");




    private static final Logger LOGGER = LogManager.getLogger(NavigatorBar.class);
    public WebDriver driver;

    public NavigatorBar(WebDriver driver){
        this.driver = driver;
    }

    public Furniture mouseHoverToFurniture(){
        LOGGER.debug("Mouse Hover to Furniture option");
        ActOn.element(driver,Furniture).mouseHover();
        return new Furniture(driver);
    }

    public Rugs mouseHoverToRugsOption() {
        LOGGER.debug(" to Rugs");
        ActOn.element(driver,Rugs).click();
        return new Rugs(driver);
    }
    public Decor mouseHoverToDecor() {
        LOGGER.debug("Navigating to Decor option");
        ActOn.element(driver, Decor).click();
        return new Decor(driver);
    }
    public BedAndBath mouseHoverToBedAndBathOption() {
        ActOn.element(driver,MouseHoverToBedAndBath).mouseHover();
        LOGGER.info(" Mouse hover to Bed And Bath option");
        return new BedAndBath(driver);
    }
    public HomeImprove mouseHoverToHomeImprove() {
        LOGGER.debug("Mouse Hover to Home Improve option");
        ActOn.element(driver,HomeImprove).click();
        return new HomeImprove(driver);
    }
    public Kitchen mouseHoverToKitchenOption() {
        LOGGER.debug("Mouse Hover to Kitchen option");
        ActOn.element(driver, Kitchen).click();
        return new Kitchen(driver);
    }
    public Outdoor mouseHoverToOutdoor() {
        LOGGER.debug("Mouse Hover to Outdoor option");
        ActOn.element(driver,Outdoor).click();
        return new Outdoor(driver);
    }
    public Jewelry mouseHoverToJewelry() {
        LOGGER.debug("mouse Hover to Jewelry option");
        ActOn.element(driver,jewelry).click();
        return new Jewelry(driver);
    }
    public Lighting mouseHoverToLighting() {
        LOGGER.debug("Mouse Hover to Lighting option");
        ActOn.element(driver,Lighting).click();
        return new Lighting(driver);
    }
    public KidsAndBaby mouseHoverToBabyAndKids() {
        LOGGER.debug("Mose Hover to Baby&Kids option");
        ActOn.element(driver,BabyAndKids).click();
        return new KidsAndBaby(driver);
    }

}

