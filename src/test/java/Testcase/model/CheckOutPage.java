package Testcase.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private final WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterShippingDetails(String country, String state, String zip) {
        driver.findElement(By.id("country")).sendKeys(country);
        driver.findElement(By.id("region_id")).sendKeys(state);
        driver.findElement(By.id("postcode")).sendKeys(zip);
        driver.findElement(By.xpath("//span[contains(text(),'Estimate')]")).click();
    }

    public void verifyShippingCost() {
        driver.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']")).click();
    }
    public void updateTotal(){driver.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']")).click();}

    public void proceedToCheckout() {
        driver.findElement(By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]")).click();
    }

    public void enterBillingInformation(String newAddress,String address,String city,String state,String zip, String country, String telephone) {
        driver.findElement(By.id("billing-address-select")).sendKeys(newAddress);
        driver.findElement(By.id("billing:street1")).sendKeys(address);
        driver.findElement(By.id("billing:city")).sendKeys(city);
        driver.findElement(By.id("billing:region_id")).sendKeys(state);
        driver.findElement(By.id("billing:postcode")).sendKeys(zip);
        driver.findElement(By.id("billing:country_id")).sendKeys(country);
        driver.findElement(By.id("billing:telephone")).sendKeys(telephone);
        driver.findElement(By.xpath("//label[@for='billing:use_for_shipping_no']")).click();
        driver.findElement(By.xpath("//button[@onclick='billing.save()']//span//span[contains(text(),'Continue')]")).click();
    }

    public void enterShippingInformation(String newAddress,String address,String city,String state,String zip, String country, String telephone) {
        driver.findElement(By.id("shipping-address-select")).sendKeys(newAddress);
        driver.findElement(By.id("shipping:street1")).sendKeys(address);
        driver.findElement(By.id("shipping:city")).sendKeys(city);
        driver.findElement(By.id("shipping:region_id")).sendKeys(state);
        driver.findElement(By.id("shipping:postcode")).sendKeys(zip);
        driver.findElement(By.id("shipping:country_id")).sendKeys(country);
        driver.findElement(By.id("shipping:telephone")).sendKeys(telephone);
        driver.findElement(By.xpath("//label[@for='shipping:save_in_address_book']")).click();
        driver.findElement(By.xpath("//button[@onclick='shipping.save()']//span//span[contains(text(),'Continue')]")).click();
    }

    public void ShippingMethodContinue() {
        driver.findElement(By.xpath("//button[@onclick='shippingMethod.save()']")).click();
    }

    public void selectPaymentInformationAndContinue() {
        driver.findElement(By.xpath("//label[@for='p_method_checkmo']")).click();
        driver.findElement(By.xpath("//button[@class='button']//span//span[contains(text(),'Continue')]")).click();
    }

    public void placeOrder() {
        driver.findElement(By.xpath("//button[@title='Place Order']")).click();
    }
}
