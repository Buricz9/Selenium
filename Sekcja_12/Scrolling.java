package Sekcja_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < values.size(); i++)
        {
            sum += Integer.parseInt(values.get(i).getText());
        }
//        System.out.println(sum);
        String text = driver.findElement(By.cssSelector(".totalAmount")).getText();
        String[] tabText = text.split(" ");

        Assert.assertEquals(Integer.parseInt(tabText[tabText.length - 1]), sum);

//        if (Integer.parseInt(cos[cos.length - 1]) == sum)
//        {
//            System.out.println("Jest rowne");
//        } else
//        {
//            System.out.println("Nie jest równe");
//        }

    }
}
