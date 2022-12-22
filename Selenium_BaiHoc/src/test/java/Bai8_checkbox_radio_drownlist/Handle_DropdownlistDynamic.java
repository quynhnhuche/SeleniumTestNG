package Bai8_checkbox_radio_drownlist;

import Common.Basetest;
import org.openqa.selenium.By;

public class Handle_DropdownlistDynamic extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");

        Thread.sleep(2000);

        //click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //Click chọn giá trị đã search
        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        closeBrowser();
    }
}
