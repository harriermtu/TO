import junit.framework.TestCase;

import java.util.ArrayList;

public class allSubsetsTest extends TestCase {

    public void testGenSubsetsDeleteDuplicates() throws Exception {

        assertEquals(allSubsets.genSubsets(new int[]{1,2,1,1},0),allSubsets.genSubsets(new int[]{1,2},0));
    }

    public void testGenSubsetsEmptySet() throws Exception {

        ArrayList<ArrayList<Integer>> emptyOutput = new ArrayList<ArrayList<Integer>>();
        emptyOutput.add(new ArrayList<Integer>());
        assertEquals(emptyOutput, allSubsets.genSubsets(new int[]{}, 0));
    }
}