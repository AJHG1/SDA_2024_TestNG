package sda.HomeWork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilites.TestBase;

import static org.testng.Assert.assertTrue;

public class day15_HW1 extends TestBase {

    /*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/


    @Test
    public void test() {

//        Test Case1: Positive Login Test
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //        Type username student into Username field
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("student");

        //        Type password Password123 into Password field
        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Password123");

//        Click Submit button.
        WebElement sudmit = driver.findElement(By.id("submit"));
        sudmit.click();
//verfiy new page URL contains practicetestautomation.com/logged-in-successfully/
        String url = driver.getCurrentUrl();
        System.out.println(url);
        SoftAssert sa = new SoftAssert();
        System.out.println("verfiy new page URL ");
        //soft assert
        sa.assertTrue(url.contains(".com/logged-in-successfully/"));

        //hard assert
        assertTrue(url.contains(".com/logged-in-successfully/"));

        //                Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement massage = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        String mm = massage.getText();

        //soft assert
        sa.assertTrue(mm.contains("successfully logged in"));

        //hard assert
        //Assert.assertTrue(mm.contains("successfully logged in"));

        //        Verify button Log out is displayed on the new page.
        WebElement logout = driver.findElement(By.xpath("//*[@id='loop-container']/div/article/div[2]/div/div/div/a"));

        //soft assert
        sa.assertTrue(logout.isDisplayed());

        //hard assert
        assertTrue(logout.isDisplayed());
        //sa.assertAll();

    }

}
