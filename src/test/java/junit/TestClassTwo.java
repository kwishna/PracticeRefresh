package junit;

import org.junit.*;

public class TestClassTwo {

    @Before
    public void beforeAll(){
        System.out.println("----- Before Is Running In Test Class Two -----");
    }

    @After
    public void afterAll(){
        System.out.println("----- After Is Running In Test Class Two -----");
    }

    @BeforeClass
    public static void beforeClassOne(){

        System.out.println("----- Before Class 1 Is Running In Test Class Two -----");
    }

    @BeforeClass
    public static void beforeClassTwo(){

        System.out.println("----- Before Class 2 Is Running In Test Class Two -----");
    }

    @Test
    public void testOne(){
        System.out.println("----- Running Test 1 In Test Class One -----");
    }

    @Test
    public void testTwo(){
        System.out.println("----- Running Test 2 In Test Class One -----");
    }

    @AfterClass
    public static void afterClassOne(){

        System.out.println("----- After Class 1 Is Running In Test Class Two -----");
    }

    @AfterClass
    public static void afterClassTwo(){

        System.out.println("----- After Class 2 Is Running In Test Class Two -----");
    }
}
