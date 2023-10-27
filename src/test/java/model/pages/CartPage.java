package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEmptyCart() {
        WebElement emptyCartLink = driver.findElement(By.linkText("EMPTY CART"));
        emptyCartLink.click();
    }

    public String getEmptyCartMessage() {
        WebElement emptyCartMessage = driver.findElement(By.xpath("//div[@class='page-title']"));
        return emptyCartMessage.getText();
    }
}

