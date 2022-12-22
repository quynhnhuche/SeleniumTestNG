package Bai7;

import Common.Basetest;
import org.openqa.selenium.WindowType;

public class AdvancedBrower extends Basetest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://anhtester.com");
// mở 1 tab mới
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://google.com");


        // mở cửa sổ window mới
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://anhtester.com/blog");

        closeBrowser();
    }
}
