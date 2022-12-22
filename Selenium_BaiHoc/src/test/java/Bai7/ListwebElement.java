package Bai7;

import Common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListwebElement extends Basetest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://app.hrsale.com/");
        driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(6000);
// khai báo 1 list để chứa danh sách menu
        List<WebElement> listmenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']/li"));
        //duyet list bang for each
        for (int i=0;i<listmenu.size();i++){
            System.out.println(listmenu.get(i).getText());
        }
        //hàm click vào menu nên dùng xpath trỏ trực tiếp đến 1 giá trị ko dùng list, list chỉ dùng để lấy giá trị list menu


        closeBrowser();
    }

}
