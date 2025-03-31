package helloku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxesTest {
    @Test
    void openBrowserWithDefaultMode(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
}
