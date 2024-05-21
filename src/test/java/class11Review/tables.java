package class11Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tables {
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

//  Click on the checkbox for the person with ID = 58949955
        boolean isFound = true;
        while (!isFound){
        List<WebElement> allId = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        // iterate to find the row number
        for(int i=0;i<allId.size();i++){
            String id = allId.get(i).getText();
            if(id.equals("58949955")){
                System.out.println("the row number is "+(i+1)); // i+1 = is to insure that the index will show actual number
//                row number is found
//                click on checkbox on row (i+1)
                String xpath = "//table[@id='resultTable']/tbody/tr[" +(i+1)+ "]/td[1]";  // String concatenation
                driver.findElement(By.xpath(xpath)).click();
                isFound=true;
                break;
            }
        }
//       click on next button for the next page if not found
            if(!isFound){
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
    }
        driver.quit();
    }
}
