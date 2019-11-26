package testng;

import org.testng.annotations.*;

/**
 * If The Method Name Is Same But Capitalized Letters Are There Then Capital Letter Will Run First.
 * More Than One Annotations Can Be Given to An Method.
 * If @BeforeGroups Is Mentioned But There Is No Groups Mentioned Then It Won't Run.
 */

public class TestNgOne {

    private static int count = 0;

    @Test
    public void sestOne(){
        System.out.println("sestOne");
    }

    @Test
    public void testOne(){
        System.out.println("testOne");
    }

    @Test
    public void aestOne(){
        System.out.println("aestOne");
    }

    @Test
    public void SestOne(){
        System.out.println("SestOne");
    }

    @Test
    public void TestOne(){
        System.out.println("TestOne");
    }

    @Test
    public void AestOne(){
        System.out.println("AestOne");
    }

    @BeforeTest // Click And Read Options
    @BeforeClass // Click And Read Options
    @BeforeMethod // Click And Read Options
    @BeforeGroups // Click And Read Options
    @BeforeSuite // Click And Read Options
    public void bTest(){
        System.out.println("bTest "+count++);
    }

}
