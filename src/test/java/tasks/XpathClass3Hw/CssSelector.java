package tasks.XpathClass3Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

//      find the userName text box
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("This is css xpath");
        Thread.sleep(500);

//      find the profile box
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));  // shortcut
        profileBox.sendKeys("This is css xpath shortcut");
        Thread.sleep(500);

//      find feedback field
        WebElement feedbackBox1 = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox1.sendKeys("This is the feedback #1 found by cssSelector");
        Thread.sleep(500);

//      find feedback field 2
        WebElement feedbackBox2 = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackBox2.sendKeys("This is the feedback #2 found by cssSelector");
        Thread.sleep(500);

//      send email
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("jenny@gmail.com");
        Thread.sleep(500);

//      courseTopic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium");
        Thread.sleep(500);

//      introToAdvanceCss
        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("Intro Advance Css");
        Thread.sleep(500);

//      ends-with - conclusion of CSS mODULE
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("this is ends-with CSS selector");
        Thread.sleep(1000);

        driver.quit();
    }


    }

