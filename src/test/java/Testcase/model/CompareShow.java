package Testcase.model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CompareShow {
    private WebDriver driver;

    // Locators
    private By compareProductsHeader = By.xpath("//h1[normalize-space()='Compare Products']");
    private By sonyXperiaName = By.xpath("//a[@title='Sony Xperia'][normalize-space()='Sony Xperia']");
    private By iPhoneName = By.xpath("//a[@title='IPhone'][normalize-space()='IPhone']");

    public CompareShow(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProducts() {
        if(driver.findElement(compareProductsHeader).isDisplayed()) {
            System.out.println("COMPARE PRODUCTS header found.");
        } else {
            System.out.println("COMPARE PRODUCTS header not found.");
        }

        // Verify products
        if(driver.findElement(sonyXperiaName).isDisplayed()) {
            System.out.println("Sony Xperia found in comparison.");
        } else {
            System.out.println("Sony Xperia not found in comparison.");
        }

        if(driver.findElement(iPhoneName).isDisplayed()) {
            System.out.println("IPhone found in comparison.");
        } else {
            System.out.println("IPhone not found in comparison.");
        }
    }

    public void closePopup() {
        driver.close();
    }

}

