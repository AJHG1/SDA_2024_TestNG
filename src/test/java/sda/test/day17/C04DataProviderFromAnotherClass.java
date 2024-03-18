package sda.test.day17;

import org.testng.annotations.Test;
import sda.utilites.TestBase;

public class C04DataProviderFromAnotherClass extends TestBase {

     /*
        We can use our data by retrieving it from a different class; for this, we need to properly integrate the
        data provider method as a parameter into the test method.
        */

    @Test(dataProvider = "invalidCoredentials", dataProviderClass = C03FakerDataProvider03.class)
    public void pintCrodentialsTest(String username, String password) {

        System.out.println("username : " + username + " password : " + password);

    }
}
