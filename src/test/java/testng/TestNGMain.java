package testng;

import org.testng.TestNG;

/**
 *
 * Runtime.getRuntime().addShutdownHook(new Thread()
 *     {
 *       public void run()
 *       {
 *         System.out.println("Shutdown Hook is running !");
 *       }
 *     });
 *
 * It is also possible to terminate the JVM without allowing the shutdown hooks to run by calling Runtime.halt() method.
 * We can have more than one Shutdown Hooks, but their execution order is not guaranteed.
 * Once the shutdown sequence is initiated by the JVM, it is not allowed to add more or remove any existing shutdown hooks.
 * If this is attempted, the JVM throws IllegalStateException.
 *
 *
 */
public class TestNGMain {

    public static void main(String[] args) {

        /*        TestNG.main(new String[]{
                "-testclass", "testng.TestNgOne",
                "-suitename", "TestNG tests",
                "-testname", "Group Inheritance",
                "-log", "10"
        });*/
        
        TestNG ng = new TestNG();

    }
}
