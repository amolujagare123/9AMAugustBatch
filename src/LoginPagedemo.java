import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPagedemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");


        WebElement txtUsername =  driver.findElement(By.name("username")) ; // name is the locator
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();


        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("priynaka1234");


        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("katraj,pune");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("4343434");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("48989434");

        WebElement btnSubmit = driver.findElement(By.name("Submit"));
        btnSubmit.click();









    }
}
