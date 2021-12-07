import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class test
{
    private WebDriver driver;

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ucll.be/");
        WebElement h2=driver.findElement(By.tagName("h2"));
        assertEquals("hogeschool van de moving minds",h2.getText());
        driver.quit();
    }
}
