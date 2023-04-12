package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableassignment
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaclickacademy.com/");

        driver.findElement(By.cssSelector("a[href='https://www.rahulshettyacademy.com/AutomationPractice']")).click();
        WebElement table = driver.findElement(By.className("table-display"));
        System.out.println("Point 1");
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println("Point 2");
        System.out.println(table.findElements(By.xpath("//*[@class=\"table-display\"]/tbody/tr[2]/td")).size());
        System.out.println("Point 3");
        System.out.println(table.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[3]")).getText());
    }
}
