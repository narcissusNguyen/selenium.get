package helloku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTest {
    @Test
    void checkbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        checkbox1.click();
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected());

        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        checkbox2.click();
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected());
        driver.quit();
    }

}
        


