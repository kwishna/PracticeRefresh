package junit;

import org.junit.*;

import java.io.IOException;

public class TestClassThree {

    @Before
    public void beforeAll(){
        System.out.println("----- Before Is Running In Test Class Three -----");
    }

    @After
    public void afterAll(){
        System.out.println("----- After Is Running In Test Class Three -----");
    }

    @BeforeClass
    public static void beforeClassOne(){

        System.out.println("----- Before Class 1 Is Running In Class Three -----");
    }

    @BeforeClass
    public static void beforeClassTwo(){

        System.out.println("----- Before Class 2 Is Running In Test Class Three -----");
    }

    @Test
    public void testOne(){
        System.out.println("----- Running Test 1 In Test Class Three -----");
    }

    @Test
    public void testTwo(){
        System.out.println("----- Running Test 2 In Test Class Three -----");
    }

    @Test
    public void exceptionOne() throws IOException {
        throw new IOException("---- Exception Test One In Class Three ----");
    }

    @Test(expected = IOException.class)
    public void exceptionTwo() throws IOException {
        throw new IOException("---- Exception Test Two In Class Three ----");
    }

    @Test(timeout = 0L)
    public void timeoutThree() {
        System.out.println("---- Timeout Test One In Test Three With 0L ----");
    }

    @Test(timeout = 5)
    public void timeoutFour() {
        System.out.println("---- Timeout Test Two In Test Three With 5L ----");
    }

    @AfterClass
    public static void afterClassTwo(){

        System.out.println("----- After Class 2 Is Running In Test Class Three -----");
    }

    @AfterClass
    public static void afterClassOne(){

        System.out.println("----- After Class 1 Is Running In Test Class Three -----");
    }
}
