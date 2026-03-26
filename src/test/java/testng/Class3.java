package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Class3 {
    @BeforeGroups("smoke")
    public void setUp() {
        System.out.println("class3 setup");
    }

    @AfterGroups("regression")
    public void tearDown() {
        System.out.println("class3 -teardown");
    }

    @Test(groups = {"smoke"})
    public void Class3Test1() {
    }

    @Test(groups = {"regression"})
    public void Class3Test2() {
    }

    @Test(groups = {"regression", "slow"})
    public void Class3Test3() {
    }
}

