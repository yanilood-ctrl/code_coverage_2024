package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Func1Test {
	Func1 f1=new Func1();
	

    @Test
    public void T1_x2_y0_z50() {
        int result = f1.func1(2, 0, 50);
        assertEquals(2, result); // res=2 حسب الجدول
    }

    @Test
    public void T2_x2_y1_z50() {
        int result = f1.func1(2, 1, 50);
        assertEquals(0, result); // res=0 حسب الجدول
    }

    @Test(expected = ArithmeticException.class)
    public void T3_x0_y0_z50_shouldThrow() {
    	f1.func1(0, 0, 50); // ArithmeticException بسبب res/x
    }
}
