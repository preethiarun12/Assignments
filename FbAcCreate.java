package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FbAcCreate {
    WebDriver driver;
    @Test
    public void OpenBrowser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

driver.get("https://facebook.com");
driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text' and @class='input text _58mg _5dba _2ph-' or @name='firstname']")).sendKeys("will");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text' and @id='u_7_d' or @name='lastname']")).sendKeys("smith");
   Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__' or @id='u_7_g']")).sendKeys("johnson@ymail.com");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@type='password' and @id='password_step_input' or @data-type='password']")).sendKeys("********");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@type='text' and @id='u_7_j' or @name='reg_email_confirmation__']")).sendKeys("johnson@ymail.com");
   Thread.sleep(2000);
        WebElement Day = driver.findElement(By.xpath("//select[@title='Day']"));
        Select D = new Select(Day);
        D.selectByValue("2");
        Thread.sleep(2000);
        WebElement month= driver.findElement(By.xpath("//select[@title='Month']"));
        Select M=new Select(month);
        M.selectByValue("4");
        Thread.sleep(2000);
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select Y=new Select(year);
        Y.selectByValue("1995");
        Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='radio' and @value='-1' or @id='u_7_4']")).click();
Thread.sleep(2000);
WebElement custom1=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
Select she=new Select(custom1);
she.selectByValue("1");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text' and @name='custom_gender' or @id='u_7_q']")).sendKeys("*****");
Thread.sleep(2000);

    }
    @AfterTest
    public void quit() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);
    }
    }