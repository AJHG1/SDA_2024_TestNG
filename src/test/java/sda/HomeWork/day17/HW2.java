package sda.HomeWork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilites.TestBase;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class HW2 extends TestBase {

//    Go to URL: http://crossbrowsertesting.github.io/todoapp.html
//    Checking Box todo-4 and Checking Box todo-5
//    If both clicks worked, then the following List should be have length 2.
//    Assert that this is correct
//    Assert that the todo we added is present in the list
//    Archiving old todos
//    If our archive link worked, then the following list should have length 4.
//    Assert that this is true as well
//    Doing Cross Browser Testing.


    @Test
    public void test() throws InterruptedException {

        //    Go to URL: http://crossbrowsertesting.github.io/todoapp.html
        driver.get("https://vziad3.github.io/todo-app/todo-app.html");

        List<WebElement> box = driver.findElements(By.xpath("//*[@class='done-false']"));
        System.out.println("box.size() = " + box.size());

//    Checking Box todo-4 and Checking Box todo-5
        WebElement todo4 = driver.findElement(By.xpath("//*[@name='todo-4']"));
        WebElement todo5 = driver.findElement(By.xpath("//*[@name='todo-5']"));

        todo4.click();
        todo5.click();

        Thread.sleep(3000);
//    If both clicks worked, then the following List should be have length 3.
//    Assert that this is correct
        List<WebElement> checkedox = driver.findElements(By.xpath("//*[@class='done-false']"));
        assertEquals(checkedox.size(), 3);

//    Assert that the todo we added is present in the list
        WebElement add = driver.findElement(By.id("todotext"));
        add.click();
        add.sendKeys("Abdulaziz" + Keys.ENTER);
        Assert.assertTrue(add.isDisplayed());
//    Archiving old todos
        WebElement archiving = driver.findElement(By.xpath("//*[@ng-click='todoList.archive()']"));
        archiving.click();

        Thread.sleep(2000);
//    If our archive link worked, then the following list should have length 4.
//    Assert that this is true as well
        List<WebElement> archive = driver.findElements(By.xpath("//*[@class='done-false']"));
        archive.size();
        assertEquals(archive.size(), 4);

//    Doing Cross Browser Testing.


    }
}