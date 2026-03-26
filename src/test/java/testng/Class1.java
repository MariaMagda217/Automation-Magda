package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class1 {
    @BeforeGroups("smoke")
    public void setUp() {
        System.out.println("class1 setup");

    }

    @AfterGroups("regression")
    public void tearDown() {
        System.out.println("class1 -teardown");
    }

    @Test(groups = {"smoke"})
    public void Class1Test1() {
        System.out.println("testC1.1");
    }

    @Test(groups = {"regression"})
    public void Class1Test2() {
        System.out.println("TestC1.2");
    }

    @Test(groups = {"regression", "slow"})
    public void Class1Test3() {
        System.out.println("TestC1.3");
    }
}
