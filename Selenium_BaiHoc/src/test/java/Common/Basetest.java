package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basetest {
    public static WebDriver driver;

    @BeforeMethod
    public static void createBrowser() {
        System.out.println("Start Chrome browser from BaseTest...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Chờ đợi trang load xong (trong 40s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    @AfterMethod
    public static void closeBrowser() {
        WebUI.sleep(2);
        System.out.println("Close browser from BaseTest...");
        driver.quit();

    }
}
