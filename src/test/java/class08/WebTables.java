package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        List<WebElement> tableRows = driver.findElements(By.xpath("//table [@id='task-table']/tbody/tr"));
        for(WebElement row:tableRows){
            System.out.println(row.getText());
        }

//      print all the rows of the table
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        int count = 0;
        for(WebElement row: allRows){
            if(row.getText().equalsIgnoreCase("in progress")){  // condition - status "in progress
                System.out.println("the row number is "+(count+1));
                System.out.println("//table[@id='task-table']/tbody/tr["+ (count+1)+"]");

//                print the count+1 row
                WebElement rowN = driver. findElement (By.xpath ( "//table[@id='task-table']/tbody/tr["+ (count+1)+"]"));
                System.out.println(rowN.getText());
            }
            count++;
        }
        driver.quit();
    }
}
