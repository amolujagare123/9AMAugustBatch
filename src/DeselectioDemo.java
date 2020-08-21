import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectioDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement listJobLocation = driver.findElement(By.name("source_118[]"));
        Select selJobLocation = new Select(listJobLocation);

        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Bangalore");
        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Chennai");
        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Mumbai");
        Thread.sleep(2000);
        //selJobLocation.deselectByVisibleText("Chennai");
        //selJobLocation.deselectByIndex(2);
        //selJobLocation.deselectByValue("3");

        selJobLocation.deselectAll();
    }
}
