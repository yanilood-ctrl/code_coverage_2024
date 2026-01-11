package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Func2Test {
	Func2 f2=new Func2();

    @Test
    public void T1_p5_q30() {
        String result = f2.func2(5f, 30f);
        // p = 15.00, q = 2.00
        assertEquals("p=15.00, q=2.00", result);
    }

    @Test
    public void T2_p0_q30_infinity() {
        String result = f2.func2(0f, 30f);
        // في float القسمة على 0 تعطي Infinity (ليس Exception)
        assertTrue("Expected Infinity in result, got: " + result, result.contains("Infinity"));
    }
}
