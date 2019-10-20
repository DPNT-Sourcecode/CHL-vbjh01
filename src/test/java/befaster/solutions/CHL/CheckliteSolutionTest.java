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

        Assert.assertNotNull(checkliteSolution.checklite("AAA"));
        Assert.assertEquals(checkliteSolution.checklite("AAA").intValue(), 130);
    }

    @Test
    public void checkliteSolutionWith3UnistofB() {

        Assert.assertNotNull(checkliteSolution.checklite("BB"));
        Assert.assertEquals(checkliteSolution.checklite("BB").intValue(), 45);
        Assert.assertNotEquals(checkliteSolution.checklite("BB").intValue(), 130);
    }

    @Test
    public void checkliteSolutionWithEmptyString() {

        Assert.assertEquals(checkliteSolution.checklite("").intValue(), -1);
    }

    @Test
    public void checkliteSolutionWithAllItems() {

        Assert.assertEquals(checkliteSolution.checklite("ABCD").intValue(), 115);
    }

    @Test
    public void checkliteSolutionSingleItems() {

        Assert.assertEquals(checkliteSolution.checklite("A").intValue(), 50);
        Assert.assertEquals(checkliteSolution.checklite("B").intValue(), 30);
        Assert.assertEquals(checkliteSolution.checklite("C").intValue(), 20);
        Assert.assertEquals(checkliteSolution.checklite("D").intValue(), 15);
    }
}
