package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        // click on the calendar
        WebElement cal = driver.findElement(By.xpath("//input[@id='start_date']"));
        cal.click();

        WebElement month1 = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
        // check if the month is August
        boolean isFound = false;
        while(!isFound){
            if(month1.getText().equals("August 2024")){
                //click date
                List<WebElement> dates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for(WebElement date:dates){
                    if(date.getText().equals("5")){
                        date.click();
                        break;
                    }
                }
                isFound=true;
            }else{
                WebElement nextBtn = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
                nextBtn.click();
            }
        }
    }
}
