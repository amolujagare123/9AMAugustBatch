import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // 1. open brower

      System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

     /*   System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

        // 2. maximize

        driver.manage().window().maximize();

        //3. open url

        driver.get("http://facebook.com");

        driver.close();



    }

}
