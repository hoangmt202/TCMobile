package Testcase.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class MobilePage {
    private WebDriver driver;
    private By addToCartSonyXperiaButton = By.xpath("//li[2]//div[1]//div[3]//button[1]");
    private By qtyField = By.xpath("//input[@title='Qty']");
    private By updateButton = By.xpath("//button[@title='Update']//span//span[contains(text(),'Update')]");
    private By errorMessage = By.className("error-msg");
    private By emptyCartLink = By.linkText("EMPTY CART");

    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCartSonyXperia() {
        driver.findElement(addToCartSonyXperiaButton).click();
    }

    public void updateQuantity(String quantity) {
        driver.findElement(qtyField).clear();
        driver.findElement(qtyField).sendKeys(quantity);
        driver.findElement(updateButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void clickEmptyCart() {
        driver.findElement(emptyCartLink).click();
    }

}