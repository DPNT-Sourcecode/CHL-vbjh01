package befaster.solutions.HLO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
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




