package Bai8_checkbox_radio_drownlist;

import Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Handle_multiple_checkbox extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        Thread.sleep(1000);

        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(listCheckbox.size());
        // check từng check box
        for (int i = 1; i <= listCheckbox.size();i++)
        {

        driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']")).click();
            Thread.sleep(1000);
        }
        // Kiểm tra lại xem đã check vào check box chưa
        for (int i = 1; i<= listCheckbox.size();i++)
        {
            boolean status = driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']/input")).isSelected();//hàm is Selected chỉ check được check box trong thẻ input, trước đó ko thêm input thì ham is selected ko hiểu label nên false

            System.out.println(status);
        }


        closeBrowser();
    }
}
