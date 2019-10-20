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
    }
}


