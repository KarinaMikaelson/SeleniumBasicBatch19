package tasks.CommonMethods;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotCommonMethod {
        /*
         * Takes a screenshot of the current page and saves it to the specified file path.
         * @param driver The WebDriver instance.
         * @param filePath The file path where the screenshot will be saved.
         * @throws IOException If there is an error during file operation.
         */
        public static void takeScreenshot(WebDriver driver, String filePath) throws IOException {
            // Cast the driver to TakesScreenshot
            TakesScreenshot screenshotTaker = (TakesScreenshot) driver;

            // Get the screenshot as an image file
            File srcFile = screenshotTaker.getScreenshotAs(OutputType.FILE);

            // Specify the destination file path
            File destFile = new File(filePath);

            // Copy the screenshot to the destination path
            FileHandler.copy(srcFile, destFile);
        }

        // Example usage
        public static void main(String[] args) {
            // Initialize the WebDriver (example with ChromeDriver)
            WebDriver driver = new ChromeDriver();

            try {
                // Navigate to a web page
                driver.get("https://www.example.com");

                // Take a screenshot
                takeScreenshot(driver, "path/to/save/screenshot.png");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Quit the driver
                driver.quit();
            }
        }
}

