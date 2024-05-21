package class11Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        driver.findElement(By.id("calFromDate")).click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(month);
        sel.selectByVisibleText("Aug");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2 = new Select(year);
        sel2.selectByValue("2000");

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:allDates){
            String dateValue = date.getText();
            if(dateValue.equals("15")){
                date.click();
                break;
            }

        }

        Thread.sleep(1000);
        driver.quit();

    }
}
