package sda.HomeWork.day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW2 extends TestBase {

    //  Day18HW:2
/*
Test Case2: Negative Username Test
Open page https://practicetestautomation.com/practice-test-login/
Type username incorrectUser into Username field.
Type password Password123 into Password field.
Click Submit button.
Verify error message is displayed.
Verify error message text is Your username is invalid!
*/

    @Test
    public void test() throws InterruptedException {

//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //username : student
        //password : password123
//        Type username incorrectUser into Username field.
        driver.findElement(By.id("username")).sendKeys("incorrectUser");

//        Type password Password123 into Password field.
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.xpath("//*[@id='submit']")).click();

        Thread.sleep(2000);
//                Verify error message is displayed.
        WebElement erroeMassage = driver.findElement(By.id("error"));
        erroeMassage.getText();

        Assert.assertTrue(erroeMassage.isDisplayed());
        Thread.sleep(2000);

//        Verify error message text is Your username is invalid!
        String error = "Your username is invalid!";
        Assert.assertEquals(error, erroeMassage);
    }

}
