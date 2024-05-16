package tasks.SelectFromDropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
     HomeWork #4 :
     1. Create methods
     2. close browser
     3. select from dropdown
 */
public class SelectFromDropdownHw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");


    }
}
