package junit;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClassFour {

    @Ignore
	@Test
	public void igNore() {
		System.out.println("---- It Shouldn't Be Printed From Class Four----");
	}

	@Test
	public void a1() {
		System.out.println("---- a1 ----");
	}

	@Test
	public void a2() {
		System.out.println("---- a2 ----");
	}

	@Test
	public void A1() {
		System.out.println("---- A1 ----");
	}

	@Test
	public void A2() {
		System.out.println("---- A2 ----");
	}

    @Test
    public void b1() {
        System.out.println("---- b1 ----");
    }

    @Test
    public void c1() {
        System.out.println("---- c1 ----");
    }

}
