package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        Droppable
        WebElement draggable = driver.findElement(By.id("draggable"));
//        Drop Location
        WebElement dropLocation = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);

        action.dragAndDrop(draggable,dropLocation).perform();
        Thread.sleep(500);


        driver.quit();
    }
}
