import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBoxes {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");


        /*question :

            1. select 1st & 3rd checkbox

            2. select 2nd radio button*/

        WebElement checkbox1 = driver.findElement(By.name("mycheck0"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.name("mycheck1"));


        WebElement checkbox3 = driver.findElement(By.name("mycheck2"));
        checkbox3.click();



        driver.findElement(By.id("rad1")).click();


      /*  if(!checkbox1.isSelected())
            checkbox1.click();

        if (!checkbox2.isSelected())
            checkbox2.click();

        if(!checkbox3.isSelected())
            checkbox3.click();*/
Thread.sleep(2000);
        checkbox1.click();
        checkbox2.click();
        checkbox3.click();







    }

}
