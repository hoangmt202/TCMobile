package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {
    private WebDriver driver;

    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartForSonyXperia() {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(., 'ADD TO CART')]"));
        addToCartButton.click();
    }

    public void updateQuantity(String qty) {
        WebElement qtyInput = driver.findElement(By.name("qty"));
        qtyInput.clear();
        qtyInput.sendKeys(qty);

        WebElement updateButton = driver.findElement(By.xpath("//button[contains(., 'UPDATE')]"));
        updateButton.click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class='item-msg error']"));
        return errorMessage.getText();
    }
}

