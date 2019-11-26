package junit;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * JUnit Programming Cookbook.
 * https://www.javacodegeeks.com/minibook/junit-programming-cookbook
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {

    private Object firstParam;
    private Object secondParam;

/*
    @Parameterized.Parameter(value = 0)
    private Object firstParam;
    @Parameterized.Parameter(value = 1)
    private Object secondParam;
*/

    public ParameterizedTest(Object a, Object b){

        this.firstParam = a;
        this.secondParam = b;
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Parameterized.Parameters
    public static Object[][] parametersHere() {

        return (new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true},
                {1, "2"},
                {1, "2"},
                {1, "2"}
        });
    }

    @Test
    public void parameterizedTest(){

        System.out.println("Value Of 'a' Is : "+this.firstParam+" , Value Of 'b' Is : "+this.secondParam);
    }

    @Test
    public void paramNoTest(){

        System.out.println("----- This Is paramNoTest -----");
    }

    @Before
    public void beforeTest(){
        System.out.println("----- before -----");
    }

    @After
    public void afterTest(){
        System.out.println("----- after -----");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("----- before class -----");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("----- after class -----");
    }
}
