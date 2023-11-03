package Testcase.Test;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import Testcase.model.CheckOutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC08 {
    private WebDriver driver;

    public void savePreviouslyPlacedOrderAsAPdfFile() {
        try {
            driver = new ChromeDriver();

            driver.get("http://live.techpanda.org");

            LoginPage loginPage = new LoginPage(driver);
            CartPage cartPage = new CartPage(driver);
            CheckOutPage checkOutPage = new CheckOutPage(driver);
            // Login with the account using previously created credential
            loginPage.ClickAccountButton();
            loginPage.ClickMyAccountLink();
            loginPage.login("jeruchi@gmail.com","123456");
            //  Click on 'REORDER' link , change QTY & click Update
            cartPage.ClickReOrder();
            cartPage.changeQuantity("10");
            WebElement grandTotalElement = driver.findElement(By.xpath("//span[contains(text(),'$6,150.00')]"));
            String currentGrandTotal = grandTotalElement.getText();

            // Expected Grand Total price
            String expectedGrandTotal = "$4,920.00";

            // Compare the current price with the expected price
            if (currentGrandTotal.equals(expectedGrandTotal)) {
                System.out.println("Grand Total is the same as expected: " + currentGrandTotal);
            } else {
                System.out.println("Grand Total has changed: " + currentGrandTotal);
            }
            //  Complete Billing & Shipping Information
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
        }catch (Exception e){
            driver.quit();
        }
    }
}