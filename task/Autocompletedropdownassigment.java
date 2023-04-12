package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletedropdownassigment
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("nor");

        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
        Thread.sleep(1000);
        String text = driver.findElement(By.cssSelector("input[id='autocomplete']")).getAttribute("value");

        while (!text.contains("Norway"))
        {
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
            text = driver.findElement(By.cssSelector("input[id='autocomplete']")).getAttribute("value");
        }
    }
}
