package test.java.testng;

import org.testng.annotations.*;

public class TestNGTwo {

    private static int count = 0;

    @Test
    public void sestOne(){
        System.out.println("2sestOne");
    }

    @Test
    public void testOne(){
        System.out.println("2testOne");
    }

    @Test
    public void aestOne(){
        System.out.println("2aestOne");
    }

    @Test
    public void SestOne(){
        System.out.println("2SestOne");
    }

    @Test
    public void TestOne(){
        System.out.println("2TestOne");
    }

    @Test
    public void AestOne(){
        System.out.println("2AestOne");
    }

    @BeforeTest // Click And Read Options
    @BeforeClass // Click And Read Options
    @BeforeMethod // Click And Read Options
    @BeforeGroups // Click And Read Options
    @BeforeSuite // Click And Read Options
    public void bTest(){
        System.out.println("2bTest "+count++);
    }

}
