import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaiTap {
    @Test
   void openBrowserWithDefaultMode(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://brave.com/");
        Assert.assertEquals(driver.getTitle(),"Selenium");
        //driver.quit();
    }
    @Test
    void openBrowserWithHeadlessMode(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://brave.com/");
        Assert.assertEquals(driver.getTitle(),"Selenium");
        //driver.quit();
    }

}
