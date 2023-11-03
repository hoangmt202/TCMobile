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
    private  By ViewOrder = By.xpath("//tr[@class='first odd']//a[contains(text(),'View Order')]");
    private By PrintOrder = By.xpath("//a[@class='link-print']");
    private By ReOrder = By.xpath("//tr[@class='first odd']//a[@class='link-reorder'][normalize-space()='Reorder']");
    private By quantityField = By.xpath("//input[@name='cart[216282][qty]']");
    private By UpdateQty = By.xpath("//tr[@class='first odd']//button[@title='Update']");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickWishListLink(){driver.findElement(WishlistLink).click();}
    public void AddToCartInWishList(){driver.findElement(AddToCartButton).click();}
    public void ClickViewOrder(){driver.findElement(ViewOrder).click();}
    public void ClickPrintOrder(){driver.findElement(PrintOrder).click();}
    public void ClickReOrder(){driver.findElement(ReOrder).click();}
    public void changeQuantity(String quantity) {
        driver.findElement(quantityField).clear();
        driver.findElement(quantityField).sendKeys(quantity);
        driver.findElement(UpdateQty).click();
    }

    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }
}


