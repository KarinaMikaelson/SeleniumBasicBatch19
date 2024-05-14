package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeeksAlertExample {
    public static void main(String args[]) throws InterruptedException {
    /*
     Output:
          The program will open the website and click on the confirmation alert button and accept the alert
          and, again it click the alert button and decline the alert.
    */
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://demoqa.com/alerts");

        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        Thread.sleep(3000);

        // accepting javascript alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        Thread.sleep(3000);

        // Rejecting javascript alert
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        Thread.sleep(1000);
        driver.quit();

    }
}
