package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/*

        Common Methods for all classes
        1. We can change the Name of the Browser in Config.properties
 */
public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication() throws IOException {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("invalid Browser Name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));
    }
     /*
     HW:
     1. Create methods
     2. close browser
     3. select from dropdown
     */

    public static void closeBrowser() throws IOException {
        driver.quit();
    }
}
