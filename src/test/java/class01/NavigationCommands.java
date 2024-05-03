package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

       // go to the url
        driver.navigate().to("https://www.facebook.com/");
        //slow down the code
        Thread.sleep(2000);
        //got yo google.com back
        driver.navigate().back();

        Thread.sleep(2000);
        // go forward to fb
        driver.navigate().forward();

        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();

        Thread.sleep(2000); // slow down to observe
        // close the browser
        driver.close();
    }
}
