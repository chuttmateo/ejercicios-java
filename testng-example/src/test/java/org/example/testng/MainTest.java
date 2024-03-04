package org.example.testng;

import org.example.testng.listeners.PrintListener;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

//@Listeners(value = PrintListener.class) //If we use it, we will not need to specify it in the main_suit.xml
public class MainTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }


    @DataProvider
    public Object[][] personData(){
        return new Object[][]{
                {"mateo", 22},
                {"esteban", 10},
                {"juan", 1}
        };
    }

    @Test(dataProvider = "personData")
    public void verifyPersonInstantiationTest(String firstName, int age){
        Person person = new Person(firstName, age);
        Assert.assertNotNull(person, "Person variable is null");
    }

    @Test(description = "Verify Sum With Positive Numbers")
    public void verifySumWithPositiveNumbersTest(){
        int result = Main.sum(2, 2);
        Assert.assertEquals(result, 4, "Result number and Expected number don't match");
    }

    @Test(enabled = false)
    public void verifySumWithNegativeNumbersTest(){
        int result = Main.sum(-2, -2);
        Assert.assertEquals(result, -4,"Result number and Expected number don't match");
    }

    @Test
    public void verifySumTest(){
        SoftAssert softAssert = new SoftAssert();
        int result = Main.sum(2, 2);
        softAssert.assertEquals(result, 4, "Result number and Expected number don't match");
        softAssert.assertAll();
    }

}
