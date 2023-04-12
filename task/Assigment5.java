package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assigment5
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
        String text = driver.findElement(By.cssSelector("label[for='benz']")).getText();

        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText(text);

        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();

        Assert.assertTrue(driver.switchTo().alert().getText().contains(text));

    }
}
