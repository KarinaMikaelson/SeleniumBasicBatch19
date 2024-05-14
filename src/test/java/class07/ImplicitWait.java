package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//      implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));     // the program will wait until text is appeared
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
//---------------------------------------------------- First Box
//      click the button
        WebElement button1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();
        Thread.sleep(500);

//      find and print the text
        WebElement text = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        System.out.println(text.getText());
        Thread.sleep(500);
//---------------------------------------------------- Second Box
        WebElement button2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();

        WebElement radioBtn = driver.findElement(By.xpath("//label[@class='radio-inline']"));
        radioBtn.click();
        Thread.sleep(500);
//---------------------------------------------------- Third Box
        WebElement button3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        button3.click();

        WebElement radioButton = driver.findElement(By.xpath("//input[@value='Option-1']"));
        radioButton.click();
        Thread.sleep(500);


        driver.quit();
    }
}
