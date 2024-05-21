package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//      LOGIN
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//  Click on PIM Option]
//  click on the checkbox with id 11076495
//  iterate thru pages until the condition (id is found) is met
//  While Loop
//  When we click on Next button, the page is refreshing, will be Exception
//  To avoid Exception, we need to locate List inside the While Loop, so it will be there each iteration

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        boolean isFound = false;
        while (!isFound){
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for(int i=0; i < ids.size();i++){
                String id = ids.get(i).getText();
                if(id.equals("11076495")){
                    System.out.println("the row number on which this id is located is "+(i+1));

                    // find and click on the checkbox on that row
                    WebElement checkBox1 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                    checkBox1.click();
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                //click next button
                WebElement clickNextPage = driver.findElement(By.xpath("//a[text()='Next']"));
                clickNextPage.click();
            }
        }
        driver.quit();
    }
}
