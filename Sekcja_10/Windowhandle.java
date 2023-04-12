package Sekcja_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Windowhandle
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentId,childId]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
        System.out.println(text);

        //first way
        String emailId[] = text.split(" ");
        System.out.println(emailId[4]);

//        second way
//        String emailId[] = text.split("at")[1].trim().split(" ");
//        System.out.println(emailId[0]);

        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId[4]);


    }
}
