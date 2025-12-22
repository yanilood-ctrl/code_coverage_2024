package code_coverage_4.code_coverage_4;

public class ActivityDecision {

    public static String decideActivity(
            boolean walking,
            boolean midnight,
            boolean running,
            boolean sunshine,
            boolean raining) {

        if (walking && midnight) {
            if (raining) {
                return "Take umbrella and searchlight";
            } else {
                return "Take searchlight";
            }
        } 
        else if (running && sunshine) {
            if (raining) {
                return "Take umbrella";
            }
        }

        return "Keep doing what you were doing";
    }
}

