package Testcase.Test;

import Testcase.model.CheckOutPage;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
@Test
public class TC05 {
    private WebDriver driver;

    public void createAccount() {
        try {
            driver = new ChromeDriver();

            driver.get("http://live.techpanda.org");

            LoginPage loginPage = new LoginPage(driver);
            CartPage cartPage = new CartPage(driver);
            loginPage.ClickAccountButton();
            loginPage.ClickMyAccountLink();
            loginPage.ClickCreateAccountButton();
            loginPage.create("Hieu","Tran","vitamin@gmail.com","123456","123456");
            loginPage.ClickTVButton();
            loginPage.ClickAddToWishListLink();
            loginPage.ClickShareWishList();
            loginPage.share("a@gmail.com","a");
        } catch (Exception e) {
            driver.quit();
        }
    }
}
