package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardKeys {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/keypress.php");

//       KeyPress
        WebElement keyPress = driver.findElement(By.xpath("//input[@class='form-control']"));
        keyPress.sendKeys(Keys.ENTER); // when we send the key, was it sent? that is what it checks
        Thread.sleep(1000);

        keyPress.sendKeys(Keys.END);

        driver.quit();

    }
}
