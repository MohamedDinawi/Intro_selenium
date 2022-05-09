import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSeleniumTest {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com/MohamedDinawi/Intro_selenium");
        driver.quit();
    }
}
