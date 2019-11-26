package first;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Command Line : java org.testng.TestNG testng1.xml [testng2.xml testng3.xml ...]
 */
public class FirstTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test_one() {

		System.out.println(System.getProperty("suiteXmlFile"));
		int method = 1 / 0;
	}

	@Test(groups = "smoke")
	public void testOne(){
		System.out.println("-- Test Smoke --");
	}

	@Test(groups = "int")
	public void testTwo(){
		System.out.println("-- Test int --");
	}

	@Test(groups = "prod")
	public void testThree(){
		System.out.println("-- Test Prod --");
	}

	@Test(groups = "qa")
	public void testFour(){
		System.out.println("-- Test qa --");
	}


	@BeforeTest
	public void test_two() {
		System.out.println("I am Running First Test 2");
	}

	@AfterTest
	public void test_three() {
		System.out.println("I am Running First Test 3");
	}

}
