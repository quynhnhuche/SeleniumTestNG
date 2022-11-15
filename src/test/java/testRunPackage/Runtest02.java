package testRunPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Runtest02 {
    WebDriver driver;

    @Test
    public void firstTest() {
        System.out.println("First test method");
    }

    @Test
    public void secondTest() {
        System.out.println("Second test method");
    }
}
