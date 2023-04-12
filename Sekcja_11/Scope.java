package Sekcja_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //1. Give me the count of links of the page
        System.out.println(driver.findElements(By.tagName("a")).size());

        //2. Give me the count of links of the footer
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //3. Give me the count of links of the footer in first row
        WebElement coulumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coulumnDriver.findElements(By.tagName("a")).size());

        //4. Click on each link in the coloumn and check if the pages are not opening
        for (int i = 1; i < coulumnDriver.findElements(By.tagName("a")).size(); i++)
        {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            coulumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(1000L);
        }

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }
}
