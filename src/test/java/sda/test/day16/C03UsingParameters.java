package sda.test.day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C03UsingParameters {

    @Test
    @Parameters("name")
    public void parameterizedTest(String name){

        System.out.println(" Welcouma " + name);

    }
    @Test
    @Parameters({" name "," surname "," age "})
    public void threeParametersTest(String name , String surname, String age){
        System.out.println(" Hello " + name + " " + surname + " " + age);
    }
}
