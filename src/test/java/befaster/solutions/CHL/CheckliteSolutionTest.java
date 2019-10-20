package befaster.solutions.CHL;

import befaster.solutions.HLO.HelloSolution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckliteSolutionTest {
    private CheckliteSolution checkliteSolution;

    @Before
    public void setUp() {

        checkliteSolution = new CheckliteSolution();
    }

    @Test
    public void checkliteSolutionWith3UnistofA() {

        Assert.assertNotNull(checkliteSolution.checklite("A,A,A"));
        Assert.assertEquals(checkliteSolution.checklite("A,A,A").intValue(), 130);
    }

    @Test
    public void checkliteSolutionWith3UnistofB() {

        Assert.assertNotNull(checkliteSolution.checklite("B,B"));
        Assert.assertEquals(checkliteSolution.checklite("B,B").intValue(), 45);
    }

    @Test
    public void checkliteSolutionWithEmptyString() {

        Assert.assertEquals(checkliteSolution.checklite("").intValue(), -1);
    }

    @Test
    public void checkliteSolutionWithAllItems() {

        Assert.assertEquals(checkliteSolution.checklite("A,B,C,D").intValue(), 115);
    }
}




