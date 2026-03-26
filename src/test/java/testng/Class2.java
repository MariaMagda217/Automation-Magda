package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class2 {
    @BeforeGroups("smoke")
    public void setUp() {
        System.out.println("class2 setup");
    }

    @AfterGroups("regression")
    public void tearDown() {
        System.out.println("class2 -teardown");
    }

    @Test(groups = {"smoke"})
    public void Class2Test1() {
    }

    @Test(groups = {"regression"})
    public void Class2Test2() {
    }

    @Test(groups = {"regression", "slow"})
    public void Class2Test3() {
    }
}

