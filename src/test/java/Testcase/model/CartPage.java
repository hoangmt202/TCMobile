package Testcase.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private WebDriver driver;
    private By cartMessage = By.xpath("//h1[normalize-space()='Shopping Cart is Empty']");
    private By WishlistLink = By.xpath("//a[@title='My Wishlist (1 item)']");
    private By AddToCartButton = By.xpath("//span[contains(text(),'Add to Cart')]");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickWishListLink(){driver.findElement(WishlistLink).click();}
    public void AddToCartInWishList(){driver.findElement(AddToCartButton).click();}
    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }
}


