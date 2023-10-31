package Testcase.Test;
import Testcase.model.CheckOutPage;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class TC06 {
    private WebDriver driver;

    public void testECommercePurchase() {
        try{
        driver = new ChromeDriver();

        driver.get("http://live.techpanda.org");

        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        // Step here
        loginPage.ClickAccountButton();
        loginPage.ClickMyAccountLink();
        loginPage.login("jeruchi@gmail.com","123456");
        loginPage.ClickAccountButton();
        cartPage.ClickWishListLink();
        cartPage.AddToCartInWishList();
        checkOutPage.enterShippingDetails("United States", "California", "12345");
        checkOutPage.verifyShippingCost();
        checkOutPage.updateTotal();
        checkOutPage.proceedToCheckout();
        checkOutPage.enterBillingInformation("New Address","a","Bien Hoa","Alaska","123","United States","12345689");
            Thread.sleep(5000);
        checkOutPage.enterShippingInformation("New Address","a","Dong Nai","Alaska","123","United States","145689");
            Thread.sleep(5000);
        checkOutPage.ShippingMethodContinue();
            Thread.sleep(5000);
        checkOutPage.selectPaymentInformationAndContinue();
            Thread.sleep(5000);
        checkOutPage.placeOrder();
            Thread.sleep(5000);
        }
        catch (Exception e){driver.quit();}
    }
}