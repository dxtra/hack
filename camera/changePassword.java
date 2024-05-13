import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword
{
     public static void main(String[] args) 
     {
            System.setProperty("webdriver.chrome.driver","specify your chromedriver.exe path here");
            WebDriver driver = new ChromeDriver();
            String URL = "Camera URL from table";
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Old password state
            driver.findElement(By.xpath("Old Password Field xpath here")).sendKeys("old password");
            driver.findElement(By.xpath("New Password Field xpath here")).sendKeys("new password");
            driver.findElement(By.xpath("Re-enter Password Field xpath here")).sendKeys("new password");
            driver.findElement(By.xpath("Submit button xpath")).click();
   }     
}

