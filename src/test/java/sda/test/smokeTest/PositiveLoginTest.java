package sda.test.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class PositiveLoginTest extends TestBase {


    @Test
    public void test() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        String expectadURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actuaUrl = driver.getCurrentUrl();
        Assert.assertEquals(actuaUrl, expectadURL, "Actusl psgr url is not the same expected");

        WebElement successMassage = driver.findElement(By.tagName("strong"));
        String exectedMassage = "Congratulations student. you successfully loggod in!";
        String actualMassage = successMassage.getText();

        Assert.assertTrue(actualMassage.contains(exectedMassage), "Actual Massage dose not contain expected. Actual Massage :  " + actualMassage);

        WebElement logoutButton = driver.findElement(By.linkText("log out"));
        Assert.assertTrue(logoutButton.isDisplayed(), "log out button is not visible");

    }
}
