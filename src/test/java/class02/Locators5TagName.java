package class02;
/*
get all the links on the console
 //a - to find all <a tag in the DOM
href - holds all the links
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators5TagName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        //find all links (<a tag) on the webpage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        // iterate over the list
        for(WebElement link:allLinks){
            String linkText = link.getAttribute("href");
            System.out.println(linkText);

        }
    }
}