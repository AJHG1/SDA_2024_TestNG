package sda.test.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilites.TestBase;

public class NegativeLoginTest extends TestBase {

    @Test
    public void test(){

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("wrong Password");
        driver.findElement(By.id("submit")).click();

        SoftAssert softAssert = new SoftAssert();

        String expectedErrorsMes = "Your password is invalid";
        WebElement expectedErrors = driver.findElement(By.id("error"));
    softAssert.assertTrue(expectedErrors.isDisplayed());
    softAssert.assertEquals(expectedErrors.getText(),expectedErrorsMes);

    softAssert.assertAll();

    }
}
