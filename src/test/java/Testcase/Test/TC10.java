package Testcase.Test;
import Testcase.adminModel.OrderPage;
import Testcase.adminModel.loginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import driver.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

@Test
public class TC10 {
    private WebDriver driver;

    public void screenshotCaptureOrderIdByCondition() {
        try {
            driver = new ChromeDriver();

            driver.get("http://live.techpanda.org/index.php/backendlogin");

            loginPage login = new loginPage(driver);
            OrderPage orderPage = new OrderPage(driver);
            //login
            login.login("user01","guru99com");
            Thread.sleep(2000);
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
            Thread.sleep(1000);
            // exit message
            login.ClickIncomingError();
            Thread.sleep(1000);
            // sale -> order
            login.ClickSalesButton();
            Thread.sleep(1000);
            login.ClickOrderButton();
            Thread.sleep(1000);
            // order id , from date, to date then click search
            orderPage.orderId("100021290","11/9/2023","11/9/2024");
            Thread.sleep(3000);
            // screen shot capture
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String png = "D:\\FPT_University_courses\\SWT301\\selenium-webdriver-java-master\\src\\test\\java\\Testcase\\Test\\TC10.png";
            FileUtils.copyFile(srcFile, new File(png));
        }catch(Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}