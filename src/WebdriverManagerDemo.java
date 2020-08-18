import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverManagerDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");

        System.out.println("The current url:"+driver.getCurrentUrl());
        System.out.println("The page title:"+driver.getTitle());

        System.out.println("The page Source:"+driver.getPageSource());

        driver.navigate().to("http://gmail.com");

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();


    }
}
