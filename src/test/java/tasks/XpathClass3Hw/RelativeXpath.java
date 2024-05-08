package tasks.XpathClass3Hw;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        // pass a userName , Select using Attribute:
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("User Name");
        Thread.sleep(500);

        // click the button, Select using Text:
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        Thread.sleep(500);

        // pass a security question, Select using Contains Method:
        WebElement securityQuestion = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityQuestion.sendKeys("This is security question");
        Thread.sleep(500);

        //Select using Text Contains:
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum')]"));
        System.out.println(text.getText());
        Thread.sleep(500);

        //Select using Starts With, /API settings
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("API");
        Thread.sleep(500);

        // Select  using Indexing: email
        WebElement email1 = driver.findElement(By.xpath("//input[@class='form-control backup']"));
        email1.sendKeys("test@yahoo.com");
        Thread.sleep(500);

        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("test2@gmail.com");
        Thread.sleep(500);

        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("Test3@yahoo.com");
        Thread.sleep(500);

        //Select using Multiple Attributes (& Operator):
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("Field - 1");
        Thread.sleep(500);

        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("Field - 2");
        Thread.sleep(500);

        //Select using your choice of xpath:
        WebElement fieldOne = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        fieldOne.sendKeys("Field One");
        Thread.sleep(500);

        WebElement fieldTwo = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        fieldTwo.sendKeys("Field Two");
        Thread.sleep(500);

        driver.quit();
    }
}
