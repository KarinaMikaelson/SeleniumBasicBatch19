package tasks.XpathClass2Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/input-form-locator.php");

        WebElement firstName = driver.findElement(By.id("first_name"));
        Thread.sleep(1000);

        firstName.sendKeys("Kara");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Mikael");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("hdgf@yahoo.com");
        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.id("submit_button"));
        submitButton.click();
        Thread.sleep(1000);

        WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        clickHere.click();
        Thread.sleep(1000);

        WebElement link = driver.findElement(By.linkText("Link"));
        link.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
