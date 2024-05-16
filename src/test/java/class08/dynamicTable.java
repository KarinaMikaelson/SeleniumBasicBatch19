package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//      LOGIN
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//  Click on PIM Option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

//  click on the checkbox with id 73420676
        List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0; i < ids.size();i++){
            String id = ids.get(i).getText();
            if(id.equals("73420676")){
                System.out.println("the row number on which this id is located is "+(i+1));

              // find and click on the checkbox on that row
                WebElement checkBox1 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox1.click();
            }
        }
        driver.quit();

    }
}
