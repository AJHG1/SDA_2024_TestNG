package sda.HomeWork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW3 extends TestBase {

    //D15HW03:
    //Test Case3: Negative Password Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username student into Username field.
    //Type password incorrectPassword into Password field.
    //Puch Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your password is invalid!

    @Test
    public void test() {

        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username student into Username field.
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

        //Type password incorrectPassword into Password field.
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("incorrectPassword");

        //Push Submit button.
        WebElement sudmit = driver.findElement(By.id("submit"));
        sudmit.click();

        //Verify error message is displayed.
        WebElement error = driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed());

        //Verify error message text is Your password is invalid!
        String errormassage = error.getText();
        Assert.assertEquals("Your password is invalid!", errormassage);
//
    }
}
