package tasks.XpathClass3Hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        //Following Sibling:
        //Enter the name of our favourite book, then the second and third best:
        WebElement favoriteBook1 = driver.findElement(By.xpath("//input[@id='favourite-book']"));
        favoriteBook1.sendKeys("Angel's Fall");
        Thread.sleep(500);

        WebElement favoriteBook2 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        favoriteBook2.sendKeys("Harry Potter");
        Thread.sleep(500);

        WebElement favoriteBook3 = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        favoriteBook3.sendKeys("The Witcher");
        Thread.sleep(500);

        // Preceding Sibling:
        //Enter the name of your books, in reverse order, from least favorite:
        WebElement leastFavBook1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavBook1.sendKeys("The Witcher");
        Thread.sleep(500);

        WebElement leastFavBook2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavBook2.sendKeys("Harry Potter");
        Thread.sleep(500);

        WebElement leastFavBook3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavBook3.sendKeys("Angel's Fall");
        Thread.sleep(500);

        //Parent Child Relationship:
        //Enter the names in order: grandparent, then parent and finally child
        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("This is Granddad");
        Thread.sleep(500);

        WebElement father = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        father.sendKeys("This is Father");
        Thread.sleep(500);

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("This is Child");
        Thread.sleep(500);

        driver.quit();
    }
}
