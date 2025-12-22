package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivityDecisionTest {
	ActivityDecision x=new ActivityDecision();

    @Test
    public void walkingMidnightRaining() {
        String result = x.decideActivity(true, true, false, false, true);
        assertEquals("Take umbrella and searchlight", result);
    }

    @Test
    public void walkingMidnightNotRaining() {
        String result = x.decideActivity(true, true, false, false, false);
        assertEquals("Take searchlight", result);
    }

    @Test
    public void runningSunshineRaining() {
        String result = x.decideActivity(false, false, true, true, true);
        assertEquals("Take umbrella", result);
    }

    @Test
    public void defaultCase() {
        String result = x.decideActivity(false, false, false, false, false);
        assertEquals("Keep doing what you were doing", result);
    }
}