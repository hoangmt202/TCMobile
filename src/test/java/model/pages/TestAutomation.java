package model.pages;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;

public class TestAutomation {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testMobilePage() {
        // Step 1: Go to http://live.techpanda.org/
        driver.get("http://live.techpanda.org/");

        MobilePage mobilePage = new MobilePage(driver);

        // Step 2: Click on "MOBILE" menu
        // This can be handled outside the page object, as it's a common step
        // ...

        // Step 3: Click on "ADD TO CART" for Sony Xperia mobile
        mobilePage.clickAddToCartForSonyXperia();

        // Step 4: Change "QTY" value to 1000 and click "UPDATE" button
        mobilePage.updateQuantity("1000");

        // Step 5: Verify the error message
        String actualErrorMessage = mobilePage.getErrorMessage();
        String expectedErrorMessage = "The requested quantity for \"Sony Xperia\" is not available.";
        // Perform assertion
        // ...

        CartPage cartPage = new CartPage(driver);

        // Step 6: Click on "EMPTY CART" link in the footer of the list of all mobiles
        cartPage.clickEmptyCart();

        // Step 7: Verify cart is empty
        String actualEmptyCartMessage = cartPage.getEmptyCartMessage();
        String expectedEmptyCartMessage = "SHOPPING CART IS EMPTY";
        // Perform assertion
        // ...
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
