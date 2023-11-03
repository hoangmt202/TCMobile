package Testcase.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By AccountButton = By.xpath("//span[@class='label'][normalize-space()='Account']");
    private By MyAccountLink = By.xpath("//div[@id='header-account']//a[@title='My Account'][normalize-space()='My Account']");
    private By CreateAccountLink = By.xpath("//span[contains(text(),'Create an Account')]");
    private By TVButton = By.xpath("//a[normalize-space()='TV']");
    private By AddToWishListLink = By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]");
    private By ShareWishList = By.xpath("//button[@title='Share Wishlist']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickCreateAccountButton() {
        driver.findElement(CreateAccountLink).click();
    }

    public void ClickAccountButton() {
        driver.findElement(AccountButton).click();
    }

    public void ClickMyAccountLink() {
        driver.findElement(MyAccountLink).click();
    }

    public void ClickTVButton() {
        driver.findElement(TVButton).click();
    }

    public void ClickAddToWishListLink() {
        driver.findElement(AddToWishListLink).click();
    }

    public void ClickShareWishList() {
        driver.findElement(ShareWishList).click();
    }

    public void login(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }

    public void create(String firstname, String lastname, String email, String password, String confirmPass) {
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("email_address")).sendKeys(email);
        if (password.equals(confirmPass)) {
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("confirmation")).sendKeys(confirmPass);
        } else {
            System.out.println("Password and confirmation do not match.");
        }
        driver.findElement(By.xpath("//button[@title='Register']")).click();
    }
    public void share(String emailShare, String message){
        driver.findElement(By.id("email_address")).sendKeys(emailShare);
        driver.findElement(By.id("message")).sendKeys(message);
        driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
    }
}
