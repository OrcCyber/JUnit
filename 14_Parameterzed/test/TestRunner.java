
import org.junit.runner.JUnitCore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUAN
 */
public class TestRunner {
    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new MyRunListener());
        runner.run(TestSuite.class);
    }
}
