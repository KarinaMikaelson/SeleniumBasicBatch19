package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeeksAlertHandling {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the demoqa alerts page
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(500);

        // Click the button that triggers an alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1000);

        // Switch to the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(500);
        // Get and print the alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        Thread.sleep(500);

        // Accept the alert after getting the alert text
        alert.accept();
        Thread.sleep(1000);

        // Close the browser
        driver.quit();
    }
}
