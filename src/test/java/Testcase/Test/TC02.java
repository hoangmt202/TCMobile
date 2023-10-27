package Testcase.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC02 {

    private WebDriver driver;


    public void testECommerceVerifyProductCost() {
        driver = new ChromeDriver();

        //  Go to http://live.techpanda.org/
        driver.get("http://live.techpanda.org/");

        // Click on MOBILE menu
        WebElement mobileMenu = driver.findElement(By.linkText("MOBILE"));
        mobileMenu.click();

        // Step 3: Read the cost of Sony Xperia mobile
        WebElement sonyXperiaProduct = driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
        WebElement priceElement = sonyXperiaProduct.findElement(By.cssSelector("span[id='product-price-1'] span[class='price']"));
        String listPagePrice = priceElement.getText();
        System.out.println("Cost of Sony Xperia on list page: " + listPagePrice);

        // Step 4: Click on Sony Xperia mobile
        sonyXperiaProduct.click();

        // Step 5: Read the Sony Xperia mobile from the detail page
        String detailPagePrice = driver.findElement(By.cssSelector(".price")).getText();

        // Step 6: Compare Product value in list and details page
        assert listPagePrice.equals(detailPagePrice) : "Product cost in list page and details page are not equal";

        // Close the browser at the end of the test
        driver.quit();
    }
}
