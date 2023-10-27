package Testcase.model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class CompareMobile {
    private WebDriver driver;

    // Locators
    private By mobileLink = By.linkText("MOBILE");
    private By addToCompareSonyXperia = By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]");
    private By addToCompareIPhone = By.xpath("//li[3]//div[1]//div[3]//ul[1]//li[2]//a[1]");
    private By compareButton = By.xpath("//button[@title='Compare']");

    public CompareMobile(WebDriver driver) {
        this.driver = driver;
    }

    public void goToMobilePage() {
        driver.findElement(mobileLink).click();
    }

    public void addSonyXperiaToCompare() {
        driver.findElement(addToCompareSonyXperia).click();
    }

    public void addIPhoneToCompare() {
        driver.findElement(addToCompareIPhone).click();
    }

    public void clickCompare() {
        driver.findElement(compareButton).click();
    }
}
