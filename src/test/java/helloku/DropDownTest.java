package helloku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.DescriptorRead;

public class DropDownTest {
    @Test
    void dropDown() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[.='Option 1']")).isSelected());

     select.selectByValue("1");
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='1']")).isSelected());

        select.selectByIndex(1);
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id-'dropdown']/option[1]")).isSelected());
  driver.quit();
    }
    @Test
    void dropDown2() {
        WebDriver driver= new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByVisibleText("Banana");
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']option[.='Banana']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']option[.='Apple']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']option[.='Orange']")).isSelected());
driver.quit();
    }
}