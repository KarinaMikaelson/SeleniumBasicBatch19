package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
     JS Executor
 */
public class jsExecutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//      ----------------------------------------Example 1: Hover Button Boundary
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        // use JS Executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: pink; border: 2px solid red;');",hoverBtn);
        Thread.sleep(500);
        // this boundary script we find in Google

//        --------------------------------------- Example 2: Right Click Button boundary
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='show_context_menu']"));
        String jsScript = "var evt = document.createEvent('MouseEvents');"
        +"evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, 2, null);"
        +"arguments[0].dispatchEvent(evt);";
        js.executeScript(jsScript,rightClickBtn);
        Thread.sleep(500);
//      ----------------------------------------- Ex-3, scroll down using js
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(500);


        driver.quit();

    }
}
