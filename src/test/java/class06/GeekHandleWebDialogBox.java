package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeekHandleWebDialogBox {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable.
        // Initialize ChromeDriver.
        WebDriver driver = new ChromeDriver();

        // Navigate to the website.
        driver.get("https://demoqa.com/alerts");

        // Find and click the "Click me" button to trigger the dialog box.
        WebElement clickMeButton = driver.findElement(By.id("alertButton"));
        clickMeButton.click();

        // Explicitly wait for the alert to be present.
        int second = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert.
        org.openqa.selenium.Alert alert = driver.switchTo().alert();

        // Get the text from the alert and print it.
        System.out.println("Alert Text: " + alert.getText());

        // Accept the alert (clicking OK).
        alert.accept();

        // Close the browser.
        driver.quit();
    }
}
