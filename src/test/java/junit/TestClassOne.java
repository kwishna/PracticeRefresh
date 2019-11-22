package junit;

import org.junit.*;
import org.junit.experimental.categories.Category;

public class TestClassOne {

    @Before
    public void beforeAll(){
        System.out.println("----- Before Is Running In Test Class One -----");
    }

    @After
    public void afterAll(){
        System.out.println("----- After Is Running In Test Class One -----");
    }

    @Test
    public void testOne(){
        System.out.println("----- Running Test 1 In Test Class One -----");
    }

    @Test
 //   @Category(Regression.class) // Need To Create Interface With name Regression.
    public void testTwo(){
        System.out.println("----- Running Test 2 In Test Class One -----");
    }

    @BeforeClass
    public static void beforeClassOne(){

        System.out.println("----- Before Class 1 Is Running In Test Class One -----");
    }

    @BeforeClass
    public static void beforeClassTwo(){

        System.out.println("----- Before Class 2 Is Running In Test Class One -----");
    }

    @AfterClass
    public static void afterClassOne(){

        System.out.println("----- After Class 1 Is Running In Test Class One -----");
    }

    @AfterClass
    public static void afterClassTwo(){

        System.out.println("----- After Class 2 Is Running In Test Class One -----");
    }


}
