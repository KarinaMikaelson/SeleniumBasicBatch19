package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //Select List Demo
        //find the element with the select tag
        WebElement selectSingle = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //select class
        Select select = new Select(selectSingle);

        // select by "index"
        select.selectByIndex(3);
        Thread.sleep(500);

        //select by "value"
        select.selectByValue("Sunday");
        Thread.sleep(500);

        //select by "visible text"
        select.selectByVisibleText("Monday");
        Thread.sleep(500);

        //multiple dropDown
        WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multi-select']"));
        //select class
        Select select1 = new Select(multiSelect);

        // select by "value"
        select1.selectByValue("Florida");
        Thread.sleep(500);

        // select by "visible Text"
        select1.selectByVisibleText("New York");
        Thread.sleep(500);

        // select by "index"
        select1.selectByIndex(5);
        Thread.sleep(1000);

        // options in multiselect - deselect
        select1.deselectByIndex(5);
        Thread.sleep(500);

        System.out.println("The dropdown 2 is multiselect "+select1.isMultiple());
        System.out.println("The dropdown 1 is multiselect "+select.isMultiple());


        driver.quit();


    }
}
