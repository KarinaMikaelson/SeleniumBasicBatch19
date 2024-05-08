package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        // Relative Xpath

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

        // <Attribute Xpath>
        // send the userName in the text box
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        Thread.sleep(500);
        userName.sendKeys("This is Attribute Xpath");
        Thread.sleep(500);

        // < Text Xpath>
        // click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        // < Partial Values Xpath >
        // write the security question
        WebElement sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("This is Partial Values Xpath");
        Thread.sleep(500);

        // <Partial Values Xpath>
        // get the text
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum ')]"));
        System.out.println(text.getText());
        Thread.sleep(500);

        // <Starts-with Xpath>
        //Pass API settings
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("This is Starts-with Xpath");
        Thread.sleep(500);


        //send email
        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("This is Attribute Xpath with indexing.com");
        Thread.sleep(1000);

        // <Operators Xpath>
        // send the key to the field
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("This is Operators Xpath");
        Thread.sleep(500);

        driver.quit();


    }
}
