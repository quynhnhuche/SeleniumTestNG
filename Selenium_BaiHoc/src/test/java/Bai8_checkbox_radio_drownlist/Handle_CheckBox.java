package Bai8_checkbox_radio_drownlist;

import Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handle_CheckBox extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //kiểm tra checkbox mặc định
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        boolean checkBoxStatus = checkBox1.isSelected();

        System.out.println(checkBoxStatus);

        //Nếu checkbox bằng false thì check chọn
        if (checkBoxStatus == false) {
            checkBox1.click();
        }

        Thread.sleep(3000);

        // kiểm tra checkbox sau khi đã check chọn
        boolean checkBoxStatusAfter = checkBox1.isSelected();
        System.out.println("Trạng thái checkbox sau khi check: "+ checkBoxStatusAfter);
        // Xuất ra kết quả và text khi checkbox đã được chọn
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái message:"+ message.isDisplayed());
        System.out.println(message.getText());
        closeBrowser();
    }

}
