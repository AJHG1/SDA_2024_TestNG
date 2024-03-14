package sda.HomeWork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW1 extends TestBase {

//    HW01:
//    Go to URL: https://www.google.com
//    Search words: Java, Selenium
//    Assert get text result est that the result text contains the searched Word.
//    Run tests from XML file.

    @Test
    public void test1() {

        //    Go to URL: https://www.google.com
        driver.get("https://www.google.com");

//    Search words: Java, Selenium
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.click();
        search.sendKeys("Selenium" + Keys.ENTER);

//    Assert get text result est that the result text contains the searched Word.
        WebElement as = driver.findElement(By.xpath("//*[@id='rcnt']"));
        String a = as.getText();
        Assert.assertTrue(a.contains("Selenium"));
    }

    @Test
    public void test2() {

        //    Go to URL: https://www.google.com
        driver.get("https://www.google.com");

//    Search words: Java
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.click();
        search.sendKeys("Java" + Keys.ENTER);

//    Assert get text result est that the result text contains the searched Word.
        WebElement as = driver.findElement(By.xpath("//*[@id='rcnt']"));
        String a = as.getText();
        Assert.assertTrue(a.contains("Java"));
    }
}

