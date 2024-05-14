package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/*

        Common Methods for all classes
        1. We can change the Name of the Browser in Config.properties

     HW:
     1. Create methods
     2. close browser
     3. select from dropdown
*/
public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication() throws IOException {

//------------------------------------------------------Open Browser Method
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

//----------------------------------------------------------Close Browser Method
    public static void closeBrowser() throws IOException {
        if(driver!=null){
            driver.quit();
        }
    }
//----------------------------------------------------------Select From Dropdown Method
    public static void selectFromDropdown(WebElement dropdown, int index){
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }
    public static void selectFromDropdown(WebElement dropdown, String visibleText){
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }
    public static void selectFromDropdown(String value,WebElement dropdown){
        Select select = new Select(dropdown);
        select.selectByValue(value);


    }
}
