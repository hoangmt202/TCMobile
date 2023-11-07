package Testcase.Test;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import Testcase.model.MobilePage;
import Testcase.model.CompareMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC09 {
    private WebDriver driver;

    public void savePreviouslyPlacedOrderAsAPdfFile() {
        try {
            driver = new ChromeDriver();

            driver.get("http://live.techpanda.org");

            LoginPage loginPage = new LoginPage(driver);
            CartPage cartPage = new CartPage(driver);
            MobilePage mobilePage = new MobilePage(driver);
            //  Login the credentials provided
            loginPage.ClickAccountButton();
            loginPage.ClickMyAccountLink();
            loginPage.login("jeruchi@gmail.com", "123456");
            // Go to Sales-> Orders menu
            mobilePage.addPhoneToCart();
            mobilePage.addIphone();
            // enter code
            mobilePage.enterCouponCode("GURU50");
            // verify
            WebElement subTotalElement = driver.findElement(By.xpath("//tbody//span[@class='price'][normalize-space()='$14,650.00']"));
            String currentTotal = subTotalElement.getText();
            String expectedTotal = "$13917.50" ;
            if (currentTotal.equals(expectedTotal)) {
                System.out.println("Grand Total is the same as expected: " + expectedTotal);
            } else {
                System.out.println("Grand Total didn't change: " + currentTotal);
            }
        } catch (Exception e) {
            driver.quit();
        }
        ;
    }
}