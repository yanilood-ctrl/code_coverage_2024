package code_coverage_4.code_coverage_4;

import org.junit.Test;

public class Func3Test {
	Func3 f3=new Func3();

    @Test(expected = ArithmeticException.class)
    public void T1_x1_shouldThrow() {
    	f3.func3(1);
    }
}
