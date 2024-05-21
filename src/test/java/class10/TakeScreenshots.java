package class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //  screenshot = ss.getScreenshotAS(output.FILE);    --> data type -File
        // FileUtils.copyFile(screenshot,location in your computer)

//        taking screenshot
        TakesScreenshot ss = (TakesScreenshot)driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
//        save screenshot (the "screenshot" package was created in this project, and the screenshot was saved there.)
        // we have to write what kind of format (png,pdf etc) we want
        FileUtils.copyFile(screenshot,new File("screenshot/first.png"));
    }
}
