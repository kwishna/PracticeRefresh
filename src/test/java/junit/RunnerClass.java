package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {

    public static void main(String[] args) {

        JUnitCore core = new JUnitCore();
        core.addListener(new CustomListeners());
        core.run(SuiTe.class);
        Result res = JUnitCore.runClasses(SuiTe.class);
        for(Failure r : res.getFailures()){
            System.out.println(r.getDescription().getDisplayName());
        }

    }

    /**
     * Using CMD : java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore [test class name]
     */
}
