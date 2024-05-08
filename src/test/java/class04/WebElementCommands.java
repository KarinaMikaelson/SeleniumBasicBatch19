package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
    getAttribute(); - get attribute value
    getText(); - get text
 */
public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/selenium_commands_selector.php
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        WebElement textBox = driver.findElement(By.xpath("//input[@id= 'textInput']"));
        textBox.clear();
        textBox.sendKeys("abracadabra");
        Thread.sleep(1000);

        // check if the radio button is enabled
        //if yes click on it
        // confirm if it is selected
        WebElement rb1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean selectionState = rb1.isSelected();
        if(!selectionState){
            rb1.click();
        }
        // confirmation
        System.out.println("The radio button 1 is selected: "+rb1.isSelected());
        Thread.sleep(1000);

        //confirm that if the radio button 2 is disabled
        WebElement rb2 = driver.findElement(By.xpath("//input[@value='option2']"));
        System.out.println("The status of radio button 2 is: "+rb2.isEnabled());
        Thread.sleep(1000);

        // confirm that if the radio button 3 is displayed
        WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));
        System.out.println("The status of radio button 3 is: "+rb3.isDisplayed());
        Thread.sleep(1000);

        // get text from the webElement
        WebElement text = driver.findElement(By.xpath("//div[@id='textElement']"));
        System.out.println(text.getText());
        Thread.sleep(1000);

        // get attribute value
        WebElement attribute = driver.findElement(By.xpath(""));
        System.out.println(attribute.getAttribute("data-custom-attribute"));
        Thread.sleep(1000);

        driver.quit();

    }
}
