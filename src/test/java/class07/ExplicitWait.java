package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//      //      implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));     // the program will wait until text is appeared
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//      click on the button "click me to display button"
//      click on appeared button
        WebElement displayButton = driver.findElement(By.xpath("//button[@id='display_button']"));
        displayButton.click();


//        Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        implement the condition
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
        WebElement btn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        btn.click();


//        Open an alert
        WebElement clickAlert = driver.findElement(By.xpath("//button[@id='show_alert']"));
        clickAlert.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

//      click to enable the button, click the appeared button
        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement enabledButton = driver.findElement(By.xpath("//button[text()='Button']"));
        enabledButton.click();


        driver.quit();
    }
}
