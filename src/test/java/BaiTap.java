import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BaiTap {
    @Test
    void openBrowserWithDefaultMode() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://brave.com/");
        Assert.assertEquals(driver.getTitle(), "Selenium");
        //driver.quit();
    }

    @Test
    void openBrowserWithHeadlessMode() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://brave.com/");
        Assert.assertEquals(driver.getTitle(), "Selenium");
        //driver.quit();
    }

    @Test
    void openBrowserWithMobileViewMode() {
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 344);
        deviceMetrics.put("height", 882);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://brave.com/");
        Assert.assertEquals(driver.getTitle(), "Selenium");
        // driver.quit();

    }
}