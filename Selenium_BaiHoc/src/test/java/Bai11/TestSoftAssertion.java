package Bai11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssertion extends Basetest{
    @Test
    public void testSoftAssert(){
        driver.get("https://rise.fairsketch.com/signin");

        String headerSignInPage = driver.findElement(By.xpath("//div[@class='card-header text-center']//h2")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerSignInPage, "Sign in 123", "Header Sign In page chưa đúng.");

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

        WebElement menuClient = driver.findElement(By.xpath("//span[normalize-space()='Clients']"));

        softAssert.assertTrue(menuClient.isDisplayed(), "Menu Client không hiển thị.");

        menuClient.click();

        WebElement headerTotalClient = driver.findElement(By.xpath("//span[normalize-space()='Total clients']"));

        softAssert.assertTrue(headerTotalClient.isEnabled(), "Header Total Client không được bật.");
        softAssert.assertEquals(headerTotalClient.getText(), "Selenium", "Content of header Total Client not match.");
        //Cuối cùng của SoftAssert là phải dùng hàm assertAll() để chốt các xác nhận bên trên
        softAssert.assertAll();

    }

}
