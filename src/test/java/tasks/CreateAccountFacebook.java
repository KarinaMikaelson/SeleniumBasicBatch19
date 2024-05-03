package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(500);

        WebElement createButton = driver.findElement(By.partialLinkText("account"));
        createButton.click();
        Thread.sleep(500);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Kara");
        Thread.sleep(500);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Mikael");
        Thread.sleep(500);

        WebElement mobile = driver.findElement(By.name("reg_email__"));
        mobile.sendKeys("test@yahoo.com");
        Thread.sleep(500);

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("test123");
        Thread.sleep(500);

        WebElement monthButton = driver.findElement(By.name("birthday_month"));
        monthButton.click();
        Select selectMonth = new Select(monthButton);
        selectMonth.selectByValue("9");
        Thread.sleep(500);

        WebElement birthDate = driver.findElement(By.name("birthday_day"));
        birthDate.click();
        Select selectDate = new Select(birthDate);
        selectDate.selectByValue("10");
        Thread.sleep(500);

        WebElement birthYear = driver.findElement(By.name("birthday_year"));
        birthYear.click();
        Select selectYear = new Select(birthYear);
        selectYear.selectByValue("1990");

        WebElement selectSex = driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
        selectSex.click();
        Thread.sleep(500);

        WebElement clickSignUp = driver.findElement(By.name("websubmit"));
        clickSignUp.click();
        Thread.sleep(1000);
        driver.close();

    }
}
