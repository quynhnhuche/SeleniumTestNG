package Bai8_checkbox_radio_drownlist;

import Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handle_RadioButton extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()= 'Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));

        System.out.println(radioButton.isSelected());
        if (radioButton.isSelected() == false)
        {radioButton.click();}


        System.out.println(radioButton.isSelected());

        // check radio group

        WebElement radioGroup = driver.findElement(By.xpath("//h4[normalize-space()= 'Age Group :']/following-sibling::label[normalize-space()='5 to 15']/input"));
        radioGroup.click();
        System.out.println("Trạng thái radio group: "+ radioGroup.isSelected());
        Thread.sleep(1000);

        //kiểm tra những radio còn lại phải ko được chọn (false) dùng aler


        closeBrowser();
    }
}
