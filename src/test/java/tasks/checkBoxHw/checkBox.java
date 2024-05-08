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
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement disabledCheckbox= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        disabledCheckbox.click();

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement checkBox: checkBoxes){
            String value = checkBox.getAttribute("value");
            if(value.equalsIgnoreCase("Checkbox-4")){
                checkBox.click();
            }
        }
    }
}
