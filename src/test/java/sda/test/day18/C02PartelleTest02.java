package sda.test.day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class C02PartelleTest02 extends TestBase {

    @Test
    public void test01() {
        new ChromeDriver().get("https://www.clarusway.com");

    }

    @Test
    public void test02() {
        new ChromeDriver().get("https://www.ebay.com");

    }

    @Test
    public void test03() {
        new ChromeDriver().get("https://www.linkedin.com");
    }

    @Test
    public void test04() {
        new ChromeDriver().get("https://www.google.com");
    }

}