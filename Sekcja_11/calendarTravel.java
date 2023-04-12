package Sekcja_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calendarTravel
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");


        WebElement element = driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
        Thread.sleep(1500);


        while (!driver.findElement(By.className("flatpickr-current-month")).getText().contains("April"))
        {
            driver.findElement(By.className("flatpickr-next-month")).click();
        }


        List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
        for (int i = 0; i < dates.size(); i++)
        {
            String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
            if (text.equalsIgnoreCase("23"))
            {
                driver.findElements(By.className("flatpickr-day")).get(i).click();
                break;
            }
        }


    }

}



