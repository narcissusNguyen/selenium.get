package helloku;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuto {
    @Test
    void openBrowserWithDefaultMode() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
        driver.findElement(By.cssSelector("[href='/logout']")).click();
        // driver.quit();

        // case 2 user name sai, pw sai
        driver.findElement(By.name("username")).sendKeys("Aaaaa");
        driver.findElement(By.id("password")).sendKeys("SuperSecretP");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));

        driver.navigate().refresh();
        // case 3user name dung, pw sai
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretP");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");

        driver.navigate().refresh();
        //case 4 user name sai, pw dung
        driver.findElement(By.name("username")).sendKeys("hello");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");

    }
}