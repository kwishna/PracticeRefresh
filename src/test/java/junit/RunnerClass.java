package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerClass {

    public static void main(String[] args) {

        JUnitCore core = new JUnitCore();
        core.addListener(new CustomListeners());
        core.run(SuiTe.class);
//        Result res = JUnitCore.runClasses(SuiTe.class);

    }

    /**
     * Using CMD : java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore [test class name]
     */
}
