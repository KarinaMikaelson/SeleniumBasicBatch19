package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        Action Class - Hoover operation
//        Move the cursor over Hover Button
//        "Action move the cursor to the button"
        WebElement hooverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action = new Actions(driver);
        action.moveToElement(hooverBtn).perform();
        Thread.sleep(500);

//        "Right Click Action" -  get the button right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        action.contextClick(rightClickBtn).perform();
        Thread.sleep(500);

//        Droppable
        WebElement draggable = driver.findElement(By.id("draggable"));
//        Drop Location
        WebElement dropLocation = driver.findElement(By.id("droppable"));
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();
        Thread.sleep(500);


        driver.quit();
    }
}
