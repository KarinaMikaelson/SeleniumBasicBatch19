package tasks.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/*

from calendar select any date of your choice
 */
public class Calendar {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//          LOGIN
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

//          click on Leave
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

//-----------------------------------------------From 2022/10/07
//          click on calendar
        WebElement calendar = driver.findElement(By.xpath("//div[@class='inner']/form/fieldset/ol/li[1]/img[@class='ui-datepicker-trigger']"));////img[@class='ui-datepicker-trigger']
        calendar.click();

//         select month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(9);

//         select year
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("2022");

//         select the date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td"));
        for (WebElement day:dates)
            if (day.getText().equals("7")){
                day.click();
                break;
            }
//----------------------------------------------- To - 2023/03/12
        WebElement untilDate = driver.findElement(By.xpath("//div[@class='inner']/form/fieldset/ol/li[2]/img[@class='ui-datepicker-trigger']"));
        untilDate.click();

        WebElement endMonth = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[@class='ui-datepicker-month']"));
        endMonth.click();
        Select selectEndMonth = new Select(endMonth);
        selectEndMonth.selectByValue("2");

        WebElement endYear = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[@class='ui-datepicker-year']"));
        endYear.click();
        Select selectEndYear = new Select(endYear);
        selectEndYear.selectByValue("2023");

        WebElement endDate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[7]"));
        endDate.click();

//-----------------------------------------------Click on "Pending approval" checkbox
        WebElement checkBox = driver.findElement(By.xpath("//div[@class='checkbox_group label_first']/input[@id='leaveList_chkSearchFilter_1'][4]"));//div[@class='checkbox_group label_first']/input[@id='leaveList_chkSearchFilter_1'][4]- this one works
        checkBox.click();                                                                                                 // //div[@class='checkbox_group label_first']/input[4] - this xpath does not work

//----------------------------------------------- Type employee name

        WebElement employeeName = driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']"));//leaveList_txtEmployee_empName
        employeeName.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.e(By.xpath("")));
        employeeName.sendKeys("David");

//----------------------------------------------- Select from the dropdown "IT Support

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByValue("2");

//----------------------------------------------- Click on checkbox "Include Past Employees"
        WebElement checkbox = dropdown.findElement(By.xpath("//input[@id='leaveList_cmbWithTerminated']"));
        checkbox.click();
    }
}
