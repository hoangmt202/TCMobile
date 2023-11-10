package Testcase.adminModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    private WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("login")).sendKeys(password);
        driver.findElement(By.xpath("//input[@title='Login']")).click();
    }
    public void ClickIncomingError(){
        WebElement incomingErrorButton = driver.findElement(By.xpath("//span[normalize-space()='close']"));
        incomingErrorButton.click();
    }
    public void ClickSalesButton(){
        WebElement saleButton = driver.findElement(By.xpath("//span[normalize-space()='Sales']"));
        saleButton.click();
    }
    public void ClickOrderButton(){
        WebElement orderButton = driver.findElement(By.xpath("//span[normalize-space()='Orders']"));
        orderButton.click();
    }
}
