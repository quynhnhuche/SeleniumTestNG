package Bai8_checkbox_radio_drownlist;

import Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handle_DropdownList extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //khởi tạo đối tượng select và giá trị là 1 webElement của thẻ select trong HTML
        Select select = new Select(selectElement);
        //Get option với các hàm hỗ trợ của class select
        select.selectByVisibleText("Wednesday");
        //xuất ra kết quả chọn
        System.out.println(select.getFirstSelectedOption().getText());
        //kiểm tra xem select có phải kiểu chọn nhiều không
        System.out.println("kiểm tra phải multiple select hay không:" +select.isMultiple());
        // Kiểm tra số lượng option
        System.out.println("số lượng option:"+select.getOptions().size());
        Thread.sleep(1000);
        select.selectByIndex(7);
        Thread.sleep(1000);
        select.selectByValue("Monday");



        closeBrowser();
    }
}
