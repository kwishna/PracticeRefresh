package junit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
// @Categories.ExcludeCategory(Regression.class) // Need To Create A Regression Interface And Link With @Test With @Category Annotation
@Suite.SuiteClasses({
        TestClassThree.class,
        TestClassOne.class,
        TestClassTwo.class,
        TestClassFour.class
})
public class SuiTe {

    /**
     * Using CMD : java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore [test class name]
     * https://howtodoinjava.com/junit/how-to-add-listner-in-junit-testcases/
     * http://maven.apache.org/surefire/maven-surefire-plugin/examples/junit.html
     */
}
