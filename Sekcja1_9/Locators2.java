package Sekcja1_9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2
{

    public static void main(String[] args) throws InterruptedException
    {

        String name = "rahul";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        String password = getPassword(driver);
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        if (driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText().equals("You are successfully logged in."))
        {
            System.out.println("ten sam tekst");
        }
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(), "You are successfully logged in.");
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();
        driver.close();

    }


    public static String getPassword(WebDriver driver) throws InterruptedException
    {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText();
        String[] passwordArry = passwordText.split("'");
        System.out.println(passwordArry[1]);
        String password = passwordArry[1];
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
        Thread.sleep(1000);
        return password;
    }

}
