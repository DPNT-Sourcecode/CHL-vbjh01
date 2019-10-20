package befaster.solutions.CHL;

import befaster.solutions.HLO.HelloSolution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckliteSolutionTest {
    private HelloSolution hello;

    @Before
    public void setUp() {

        hello = new HelloSolution();
    }

    @Test
    public void printMessage() {

        Assert.assertEquals(hello.hello("Jermaine"), "Hello, Jermaine!");
        Assert.assertNotEquals(hello.hello("Henry"), "Hello, World!");
    }
}
