package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // Open the Chrome browser
        // and navigate to url
        driver.get("https://syntaxprojects.com/");
        //maximize the window
        driver.manage().window().maximize();
             // enter the full screen mode
        //driver.manage().window().fullscreen();
             //get the title of the page that you are currently on
        driver.getTitle();
        String title = driver.getTitle();
        System.out.println("the title of the page is "+title);

        Thread.sleep(4000);

        driver.quit();
    }
}
