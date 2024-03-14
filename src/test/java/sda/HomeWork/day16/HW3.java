package sda.HomeWork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW3 extends TestBase {

//    Test Case3: Parametrized Negative Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Try to login with correct user name and wrong password
//    And wrong user name and correct password
//    And wrong user name and wrong password
//    And empty user name correct password
//    Verify error message is displayed.

    @Test
    @Parameters({"username,password"})
    public void login() {

//Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//Try to login with correct user name and wrong password
        WebElement usernameAndPassword = driver.findElement(By.id("username"));
        usernameAndPassword.click();
        usernameAndPassword.sendKeys("student" + Keys.TAB + "asdewqdmfk");
        driver.findElement(By.id("submit")).click();
    }
//    And wrong user name and correct password

    @Test
    @Parameters({"username,password"})
    public void wrongUsernameAndCorrectPassword() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement uAndp = driver.findElement(By.id("username"));
        uAndp.click();
        uAndp.sendKeys("ABDULAZIZ" + Keys.TAB + "password123");
        driver.findElement(By.id("submit")).click();
    }

    @Test
    @Parameters({"username,password"})
    public void wrongUsernameAndPassword() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
//    And wrong user name and wrong password
        WebElement wrong = driver.findElement(By.id("username"));
        wrong.click();
        wrong.sendKeys("ABDULAZIZ" + Keys.TAB + "aqaq");
        driver.findElement(By.id("submit")).click();
    }

    @Test
    @Parameters({"username,password"})
    public void EmptyUserNameCorrectPassword() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
//    And empty user name correct password
        WebElement empty = driver.findElement(By.id("username"));
        empty.click();
        empty.sendKeys(" " + Keys.TAB + "Password123");
        driver.findElement(By.id("submit")).click();

//    Verify error message is displayed.
        WebElement error = driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed());
    }

}
