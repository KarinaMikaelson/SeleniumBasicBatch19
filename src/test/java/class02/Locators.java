package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        // find the element of email address and send email address to it
        WebElement email = driver.findElement(By.id("email"));   // returns WebElement
        // send information to the WebElement
        email.sendKeys("workmik@yahoo.com");
        // pass the password
        WebElement password = driver.findElement(By.name("pass"));
        //send text
        password.sendKeys("abracadabra");
        // find the button
        WebElement button = driver.findElement(By.name("login"));
        //click the button
        button.click();


    }
}
