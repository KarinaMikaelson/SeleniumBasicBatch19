package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //Radio Button Demo
        WebElement maleRb = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        maleRb.click();
        Thread.sleep(500);


        //Disabled Radio Button Demo
        WebElement enableBt = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableBt.click();
        Thread.sleep(500);

        // choose female
        WebElement femaleRb = driver.findElement(By.xpath("//input[@type='radio' and @value='gender-female' and @name='gender-identity']"));
        femaleRb.click();
        Thread.sleep(500);

        //Group Radio Buttons Demo:Click on button to get the selected values from Group Sex and Age group
        WebElement groupSex = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
        groupSex.click();
        Thread.sleep(500);

        // find locator that can access all the WebElements
        //find Elements(locator)
        //iterate to find desired webElement

        //select from 3 options
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        // iterate
        for(WebElement radioButton:radioButtons){
            String value = radioButton.getAttribute("value");
            if(value.equals("15 - 50")){
                radioButton.click();
                break;
            }
        }
        Thread.sleep(500);

        driver.quit();



    }
}
