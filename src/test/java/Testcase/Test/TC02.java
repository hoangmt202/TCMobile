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

        //  Step1: Go to http://live.techpanda.org/
        driver.get("http://live.techpanda.org/");

        // Step 2: Click on MOBILE menu
        WebElement mobileMenu = driver.findElement(By.linkText("MOBILE"));
        mobileMenu.click();

        // Step 3: Read the cost of Sony Xperia mobile
        WebElement sonyXperiaProduct = driver.findElement(By.xpath("//a[@title='Sony Xperia']"));
        WebElement priceElement = sonyXperiaProduct.findElement(By.xpath("//span[contains(text(),'$100.00')]"));
        String listPagePrice = priceElement.getText();
        System.out.println("Cost of Sony Xperia on list page: " + listPagePrice);

        // Step 4: Click on Sony Xperia mobile
        sonyXperiaProduct.click();

        // Step 5: Read the Sony Xperia mobile from the detail page

        WebElement descriptionElement = driver.findElement(By.cssSelector("div[class='tab-content'] div[class='std']"));
        String description = descriptionElement.getText();
        System.out.println("Description of Sony Xperia: " + description);
        // Step 6: Compare Product value in list and details page

        WebElement detailsPagePriceElement = driver.findElement(By.xpath("//span[@class='price']"));
        String detailsPagePrice = detailsPagePriceElement.getText();
        System.out.println("Cost of Sony Xperia on details page: " + detailsPagePrice );
        assert listPagePrice.equals(detailsPagePrice) : "Product cost in list page and details page are not equal";

        // Close the browser at the end of the test
        driver.quit();
    }
}
