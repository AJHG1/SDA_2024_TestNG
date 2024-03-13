package sda.HomeWork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilites.TestBase;

import static org.testng.Assert.assertTrue;


/*
    Test Case2: Negative Username Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username incorrectUser into Username field.
    Type password Password123 into Password field.
    Click Submit button.
    Verify error message is displayed.
    Verify error message text is Your username is invalid!

 */
public class HW2 extends TestBase {

    @Test
    public void hardAssert() throws InterruptedException {

//        Test Case1: Positive Login Test
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username incorrectUser into Username field.
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("incorrectUser");

        Thread.sleep(2000);
        //        Type password Password123 into Password field
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Password123");

//        Click Submit button.
        WebElement sudmit = driver.findElement(By.id("submit"));
        sudmit.click();

        //Verify error message is displayed.
        WebElement errorMassage = driver.findElement(By.xpath("//*[@id='error']"));
        Assert.assertTrue(errorMassage.isDisplayed());

        //Verify error message text is Your username is invalid!
        String erro = errorMassage.getText();
        Assert.assertEquals("Your username is invalid!", erro);


    }
}