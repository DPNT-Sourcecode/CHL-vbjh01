package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        String message = "Hello";

        assert friendName.length() > 0 : "String length is zero.";

        return message + " " + friendName;
    }
}

