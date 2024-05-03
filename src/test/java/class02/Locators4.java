package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // enter user name
        // enter password
        // click on login
        // tester, test
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.className("button"));
        button.click();

        // confirm that you have logged in
        WebElement message = driver.findElement(By.className("login_info"));
        // extract the element
        String text = message.getText();
        //print it
        System.out.println("the text is: "+text);

        // get the Title of the webpage
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")){
            System.out.println("You have logged in");
        }else {
            System.out.println("You have not logged in");
        }


    }
}
