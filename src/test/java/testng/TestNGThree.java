package testng;

import org.testng.annotations.Test;

@Test
public class TestNGThree { // class Level @Test Runs all The Methods Inside The class.

    public void testOne(){
        System.out.println("Test One");
    }

    public void testTwo(){
        System.out.println("Test Two");
    }

    public static void three(){
        System.out.println("fdggdfhgfhg");
    }
}
