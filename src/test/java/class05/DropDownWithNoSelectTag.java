package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithNoSelectTag {

    /*
                if there is a select tag approach:
                           1. Fins element that has the select tag
                           2. Declare the instance of select class and pass in the element as a parameter
                           3. Use methods available in select class to select your desired value
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        //
        WebElement a = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        a.click();
        Thread.sleep(500);

        // find all options
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement options:allOptions){
            String option = options.getText();
            if(option.equals("japan")){
                options.click();
                break;
            }
        }
        Thread.sleep(1000);
        driver.quit();

        // Advanced xpath -  //ul[@class='dropdown-menu']/child::li/child::a OR //ul[@class='dropdown-menu']/li/a
    }
}
