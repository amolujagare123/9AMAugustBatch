import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListdemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // select 3 cities from 1st list click on add button
        // select last 2 cities in added list box and click on on remove

        WebElement listJobLocation = driver.findElement(By.name("source_118[]"));
        Select selJobLocation = new Select(listJobLocation);

        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Bangalore");
        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Chennai");
        Thread.sleep(2000);
        selJobLocation.selectByVisibleText("Mumbai");


        WebElement imgAdd = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));

         imgAdd.click();

         WebElement listAddedJobLocation = driver.findElement(By.name("fld_118[]"));
         Select selAddedJobLocation = new Select(listAddedJobLocation);
        Thread.sleep(2000);
        selAddedJobLocation.selectByIndex(1);
        Thread.sleep(2000);
        selAddedJobLocation.selectByIndex(2);
        Thread.sleep(2000);

        WebElement imgRemove = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        imgRemove.click();





    }

}
