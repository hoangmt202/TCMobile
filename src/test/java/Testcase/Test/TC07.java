package Testcase.Test;
import Testcase.model.LoginPage;
import Testcase.model.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC07 {

    private WebDriver driver;
    public void savePreviouslyPlacedOrderAsAPdfFile(){
        try {
            driver = new ChromeDriver();

            driver.get("http://live.techpanda.org");
            LoginPage loginPage = new LoginPage(driver);
            CartPage cartPage = new CartPage(driver);
            // Login with the account using previously created credential
            loginPage.ClickAccountButton();
            loginPage.ClickMyAccountLink();
            loginPage.login("jeruchi@gmail.com","123456");
            // View order and choose print the order
            cartPage.ClickViewOrder();
            cartPage.ClickPrintOrder();
            // wait the popup appears
                Thread.sleep(5000);
            //choose the option
            WebElement saveAsPdfLink = driver.findElement(By.linkText("Lưu dưới dạng PDF"));
            saveAsPdfLink.click();

                Thread.sleep(2000);
        }
        catch (Exception e){
         driver.quit();
        }
    }
}
