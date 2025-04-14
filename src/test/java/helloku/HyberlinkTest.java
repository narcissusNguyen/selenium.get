package helloku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HyberlinkTest {
    @Test
    void hyperlink() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/redirector");
       driver.findElement(By.linkText("here")).click();
       Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes");
    //200
     driver.findElement(By.linkText("200")).click();
       Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/200");
       driver.findElement(By.linkText("here")).click();
   // 301
        driver.findElement(By.linkText("301")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/301");
        driver.findElement(By.linkText("here")).click();
    //400
        driver.findElement(By.linkText("404")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/404");
        driver.findElement(By.linkText("here")).click();
        //500
        driver.findElement(By.linkText("500")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/500");
        driver.findElement(By.linkText("here")).click();
    driver.quit();
    }
}
