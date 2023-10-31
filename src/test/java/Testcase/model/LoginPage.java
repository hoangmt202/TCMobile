package Testcase.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By AccountButton = By.xpath("//span[@class='label'][normalize-space()='Account']");
    private By MyAccountLink = By.xpath("//div[@id='header-account']//a[@title='My Account'][normalize-space()='My Account']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickAccountButton(){driver.findElement(AccountButton).click();}
    public void ClickMyAccountLink(){driver.findElement(MyAccountLink).click();}
    public void login(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }
}
