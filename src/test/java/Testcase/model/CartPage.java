package Testcase.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private WebDriver driver;
    private By cartMessage = By.xpath("//h1[normalize-space()='Shopping Cart is Empty']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }
}


