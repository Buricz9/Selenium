package task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Loginpagepractise
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        logIn(driver);
        addToCheck(driver);
    }

    public static void logIn(WebDriver driver) throws InterruptedException
    {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();

        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(options);
        dropdown.selectByValue("consult");

        driver.findElement(By.xpath("//input[@id='terms']")).click();
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

    }

    public static void addToCheck(WebDriver driver) throws InterruptedException
    {
        List<WebElement> toBuy = driver.findElements(By.xpath("//button[contains(@class,'btn btn-info')]"));
        for (int i = 0; i < toBuy.size(); i++)
        {
            toBuy.get(i).click();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li/a")).click();
    }
}
