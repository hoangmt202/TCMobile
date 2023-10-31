package Testcase.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Test
public class TC01 {

    private WebDriver driver;


    public void testECommerceSortByName() throws InterruptedException {

        driver = new ChromeDriver();

        // Step 1: Go to http://live.techpanda.org/
        driver.get("http://live.techpanda.org/");

        // Step 2: Click on MOBILE menu
        WebElement mobileMenu = driver.findElement(By.linkText("MOBILE"));
        mobileMenu.click();

        // In the list of all mobile, select SORT BY -> dropdown as name
        try {
            WebElement sortByDropdown = driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"));
            Select selectOption = new Select(sortByDropdown);
            selectOption.selectByVisibleText("Name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
