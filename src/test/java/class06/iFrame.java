package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrame {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
//      ----------------------------------First Method - By INDEX, SWITCH METHOD
//      topic box
//      If try to driver.findElement() without switching - it will give us an Exception.
        driver.switchTo().frame(0);
        Thread.sleep(500);

        WebElement input = driver.findElement(By.xpath("//input[@name='Topic']"));
        input.sendKeys("This is the First Key");
        Thread.sleep(1000);
//      ----------------------------------Second Method - By Name or ID
//      Switch to main in order to switch to the second iframe ,switch back
        driver.switchTo().defaultContent();
        Thread.sleep(500);

//      switch to second frame
        driver.switchTo().frame("dropdownIframe");
        Thread.sleep(500);

//      find the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));

//      Select from the animals
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(1000);
//      ----------------------------------Third Method: By finding the frame as a WebElement
//      switch to the main window
        driver.switchTo().defaultContent();
//      switch to the main 0 frame in which "nested" frame is present
        driver.switchTo().frame(0);
//      Finding by  WebElement
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frame3);  // by webElement

//      checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
