package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Func1Test {
	Func1 f1=new Func1 ();

    // T1: x=5, y=0, z=10  => res = 0
    @Test
    public void T1_x5_y0_z10() {
        int result = f1.func1(5, 0, 10);
        assertEquals(0, result);
    }

    // T2: x=0, y=5, z=10 => ArithmeticException (division by zero)
    @Test(expected = ArithmeticException.class)
    public void T2_x0_y5_z10_shouldThrow() {
    	f1.func1(0, 5, 10);
    }
}
