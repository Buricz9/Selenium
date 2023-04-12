package Sekcja1_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Addingitemsintocart
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        //expect
        String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot"};
        String name = "rahulshettyacademy";
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise//#/");

        add(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter promo code']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys(name);
        driver.findElement(By.cssSelector("button.promoBtn")).click();
//        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='promoInfo']")));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

    }

    public static void add(WebDriver driver, String[] itemsNeeded)
    {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++)
        {
            //Brocolli - 1 Kg
            String[] name = products.get(i).getText().split("-");
            //name[0] - 'Brocolli '
            String fromattedName = name[0].trim();//remove white spaces
            // check whether name you expect is present in array or no
            // convert array into array list for easy search
            List itemNeededList = Arrays.asList(itemsNeeded);

            if (itemNeededList.contains(fromattedName))
            {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length)
                {
                    break;
                }

            }

        }
    }
}
