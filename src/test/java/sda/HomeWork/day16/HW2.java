package sda.HomeWork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class HW2 extends TestBase {

//    Test Case2: Parametrizes Positive Login Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field
//    Type password Password123 into Password field
//    Click Submit button.
//            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
//    You should execute this test with xml file


    @Test
    @Parameters("HW2")
    public void test() {

        //    Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//    Type username student into Username field
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

//    Type password Password123 into Password field
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Password123");

//    Click Submit button.
        driver.findElement(By.id("submit")).click();
//            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String newpage = driver.getCurrentUrl();
        System.out.println("the url =  "+newpage);
        Assert.assertTrue(newpage.contains("practicetestautomation.com/logged-in-successfully/"));
//    You should execute this test with xml file

    }


}
