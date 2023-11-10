package Testcase.adminModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void orderId (String id,String fromDate,String toDate){
        driver.findElement(By.id("sales_order_grid_filter_real_order_id")).sendKeys(id);
        driver.findElement(By.name("created_at[from]")).sendKeys(fromDate);
        driver.findElement(By.name("created_at[to]")).sendKeys(toDate);
        driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
    }
}
