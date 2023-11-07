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
    private By addPhoneToCartButton = By.xpath("//a[normalize-space()='Mobile']");
    private By addIphoneButton = By.xpath("//li[1]//div[1]//div[3]//button[1]");
    private By codeField = By.xpath("//input[@id='coupon_code']");
    private By applyCodeButton = By.xpath("//span[contains(text(),'Apply')]");
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
    public void addPhoneToCart(){driver.findElement(addPhoneToCartButton).click();}
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    public void addIphone(){driver.findElement(addIphoneButton).click();}
    public void enterCouponCode(String code){
        driver.findElement(codeField).sendKeys(code);
        driver.findElement(applyCodeButton).click();
    }
    public void clickEmptyCart() {
        driver.findElement(emptyCartLink).click();
    }

}