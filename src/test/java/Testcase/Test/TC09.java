package Testcase.Test;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import Testcase.model.MobilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

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
            WebElement ActualDiscount = driver
                    .findElement(By.xpath("(//td[@colspan='1'])[3]"));
            String ExpectedDiscount = "DISCOUNT (GURU50)";
            Assert.assertNotEquals(ActualDiscount.getText(), ExpectedDiscount);


        } catch (Exception e) {
            e.printStackTrace();
        }
        //  Quit browser session
        driver.quit();
    }

}