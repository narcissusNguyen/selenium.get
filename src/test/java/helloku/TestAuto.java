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
        driver.quit();
    }
        // case 2 user name sai, pw sai
        @Test
        void tc2() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.name("username")).sendKeys("Aaaaa");
            driver.findElement(By.id("password")).sendKeys("SuperSecretP");
            driver.findElement(By.cssSelector("[type='submit']")).click();
            Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
            Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));
            driver.quit();
        }

        // case 3user name dung, pw sai
        @Test
        void tc3() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.name("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretP");
            driver.findElement(By.cssSelector("[type='submit']")).click();
            Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
            driver.quit();
        }

        //case 4 user name sai, pw dung
        @Test
        void tc4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("hello");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");

    }
}