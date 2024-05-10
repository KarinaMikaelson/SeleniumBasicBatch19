package tasks.checkBoxHw;
/*
go to the website  scroll down till bottom under disabled checkbox demo (edited)
click on enable checkboxes
select option 4
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //Single Checkbox Demo
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
        Thread.sleep(500);

        //Multiple Checkbox Demo: click on all checkBoxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkBox:checkBoxes){
            checkBox.click();
        }
        Thread.sleep(500);



        // Disabled Checkbox Demo: enable
        WebElement enableCheckboxes= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckboxes.click();
        Thread.sleep(500);

        // click on ONE checkBox
        List<WebElement> c3 =driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement c1: c3){
            String value = c1.getAttribute("value");
            if(value.equalsIgnoreCase("Checkbox-4")){
                c1.click();
            }
        }
        Thread.sleep(500);

        driver.quit();
    }
}
