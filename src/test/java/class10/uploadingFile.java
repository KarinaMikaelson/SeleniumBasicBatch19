package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingFile {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php");

//           Upload Image/file
        WebElement imageUpload = driver.findElement(By.xpath("//input[@id='image-file']"));
        imageUpload.sendKeys("/Users/karina/Desktop/CSS Selector cheat sheet.png");     // in order to upload a file, we need to write the path


    }
}
