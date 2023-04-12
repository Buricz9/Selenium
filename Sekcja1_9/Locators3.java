package Sekcja1_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators3
{
    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuba\\Desktop\\Java_Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("http://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser


/*


        //1
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());




        //2
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[6]/a")).click(); //tutaj
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("Is's enable");
        }


        //3
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
        for (WebElement option :options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }


        //4
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // if there is false test will pass
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertEquals(driver.findElements(By.cssSelector("input[type$='checkbox']")).size(),6);
        //System.out.println(driver.findElements(By.cssSelector("input[type$='checkbox']")).size());
 */




/*
        //5
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> options = driver.findElements(By.cssSelector("input[type='checkbox']"));
        options.get(0).click();
        Assert.assertTrue(options.get(0).isSelected());
        options.get(0).click();
        Assert.assertFalse(options.get(0).isSelected());
        System.out.println(options.size());

        //6
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys("Kuba");
        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys("mail@123.pl");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("zaq1@WSX");
        driver.findElement(By.xpath("//*[@id=\"exampleCheck1\"]")).click();
        List<WebElement> options = driver.findElements(By.cssSelector("option"));
        options.get(1).click();
        driver.findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("19012001");
        driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div")).getText());





 */
    }

}
