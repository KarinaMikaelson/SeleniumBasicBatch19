package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
      How to deal with JavaScript alerts:
            1. Switch the focus to the alert
            2. Accept, Dismiss, sendText, or getText from the alert
 */
public class alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        // Java Script Alert Box
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        button1.click();
        Thread.sleep(500);

        // switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        // Accept
        alert.accept();
        Thread.sleep(1000);
//      ------------------------------------------------------------
        // Java Script Confirm Box
        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        button2.click();
        Thread.sleep(1000);
        // switch - we can use the same "alert" ( alert = driver.switchTo().alert(); )

        alert.dismiss();                // dismiss - when we have a few options
        Thread.sleep(1000);
//      ------------------------------------------------------------
        // Java Script Alert Box
        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button3.click();
        Thread.sleep(1000);
        alert.sendKeys("This is Alert Accept");
        alert.accept();
        Thread.sleep(2000);

        driver.quit();
    }
}
