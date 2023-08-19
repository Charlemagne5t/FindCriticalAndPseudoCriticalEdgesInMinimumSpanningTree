import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void findCriticalAndPseudoCriticalEdgesTest1() {
        int n = 5;
        int[][] edges = {
                {0, 1, 1},
                {1, 2, 1},
                {2, 3, 2},
                {0, 3, 2},
                {0, 4, 3},
                {3, 4, 3},
                {1, 4, 6}
        };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(0, 1)));
        expected.add(new ArrayList<>(List.of(2, 3, 4, 5)));
        List<List<Integer>> actual = new Solution().findCriticalAndPseudoCriticalEdges(n, edges);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findCriticalAndPseudoCriticalEdgesTest2() {
        int n = 5;
        int[][] edges = {
                {0, 1, 1},
                {1, 2, 1},
                {2, 3, 1},
                {0, 3, 1}
        };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(new ArrayList<>(List.of(0, 1, 2, 3)));
        List<List<Integer>> actual = new Solution().findCriticalAndPseudoCriticalEdges(n, edges);

        Assert.assertEquals(expected, actual);
    }
}
